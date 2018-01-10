package com.kevin.spring.rabbitmq.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Send {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-rabbitmq-send.xml");
        AmqpTemplate amqpTemplate = context.getBean(AmqpTemplate.class);
        for (int i = 0; i < 1000; i++) {
            amqpTemplate.convertAndSend("test spring async =>" + i);
            Thread.sleep(3000);
        }
    }
}
