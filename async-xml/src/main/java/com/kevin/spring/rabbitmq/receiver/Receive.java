package com.kevin.spring.rabbitmq.receiver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Receive {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:spring/spring-rabbitmq-receive.xml");
    }
}
