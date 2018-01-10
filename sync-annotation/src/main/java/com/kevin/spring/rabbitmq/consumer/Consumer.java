package com.kevin.spring.rabbitmq.consumer;

import com.kevin.spring.rabbitmq.config.RabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RabbitConfig.class);
        AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
        System.out.println("Received: " + amqpTemplate.receiveAndConvert());
    }
}
