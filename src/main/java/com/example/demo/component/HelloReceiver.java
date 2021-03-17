package com.example.demo.component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * 接收消息组件
 * @author dengye
 *
 */
@Component
public class HelloReceiver {
 
	@RabbitListener(queues = "q_hello")
    public void one(String message) throws Exception {
        System.out.println("消息一  : ");
        System.out.println("message:"+message);
    }
	
	@RabbitListener(queues = "q_hello")
	public void two(String message) throws Exception {
		 System.out.println("消息二 : ");
	        System.out.println("message:"+message);
	}
	
}

