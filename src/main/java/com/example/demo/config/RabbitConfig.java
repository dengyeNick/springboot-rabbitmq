package com.example.demo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
	@Bean
	public Queue queue() {
		return new Queue("q_hello");
	}
	
	@Bean
    public RabbitAdmin rabbitAdmin(ConnectionFactory connectionFactory) {
	        RabbitAdmin rabbitAdmin = new RabbitAdmin(connectionFactory);
	        //用RabbitAdmin一定要配置这个，spring加载的是后就会加载这个类================特别重要
	         rabbitAdmin.setAutoStartup(true);
	         return rabbitAdmin;
	}
	
	/*
     *     简单消息监听容器
     */
    @Bean
    public SimpleMessageListenerContainer messageContainer(ConnectionFactory connectionFactory) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        return container;
    }

}
