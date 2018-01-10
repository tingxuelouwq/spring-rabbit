package com.kevin.spring.rabbitmq.producer;

import com.kevin.spring.rabbitmq.config.RabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Producer {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RabbitConfig.class);
        AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
        amqpTemplate.convertAndSend("hello world");
        System.out.println("Sent: Hello World");
    }
}
