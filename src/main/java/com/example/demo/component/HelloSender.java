package com.example.demo.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloSender {
	@Autowired
	private AmqpTemplate rabbitTemplate;
 
	public void send() {
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());// 24小时制
		String context = "hello " + date;
		System.out.println("Sender : " + context);
		// 简单对列的情况下routingKey即为Q名
		this.rabbitTemplate.convertAndSend("q_hello", context);
	}
}
