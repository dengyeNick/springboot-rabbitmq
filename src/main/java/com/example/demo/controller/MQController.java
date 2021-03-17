package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.component.HelloSender;
import com.example.demo.service.impl.MessageListenerImpl;

@RestController
public class MQController {

	@Autowired
	private HelloSender helloSender;
	
	@Autowired
	public RabbitAdmin rabbitAdmin;

	@Autowired
	public RabbitTemplate rabbitTemplate;
	
	@Autowired
	public SimpleMessageListenerContainer container;
	
	@Autowired
	public MessageListenerImpl message;
	
	
	public static String exchangeName="public";
	
	@RequestMapping("send")
	public void send() {
		helloSender.send();
	}
	
	@RequestMapping("queue_test")
	public void product(String queueName,String message) {
		createMQIfNotExist(queueName, exchangeName);
	}
	
	@RequestMapping("public")
	public void product(String value) {
		rabbitTemplate.convertAndSend(exchangeName,null,value);
	}
	
	//动态创建监听
	@RequestMapping("addListener")
	public void addListener(String queueName) {
		String[] strings=container.getQueueNames();
		List<String> list=Arrays.asList(strings);
		if (!list.contains(queueName)) {
			long numbers=container.getActiveConsumerCount();
			container.addQueueNames(queueName);
			container.setMessageListener(message);
		}
		
	}
	
	//动态创建队列
	public void createMQIfNotExist(String queueName,String exchangeName) {
		Properties properties=rabbitAdmin.getQueueProperties(queueName);
		if (properties==null) {
			Queue queue=new Queue(queueName,true,false,false,null);
			FanoutExchange fanoutExchange=new FanoutExchange(exchangeName);
			rabbitAdmin.declareQueue(queue);
			rabbitAdmin.declareExchange(fanoutExchange);
			rabbitAdmin.declareBinding(BindingBuilder.bind(queue).to(fanoutExchange));
		}
	}
}
