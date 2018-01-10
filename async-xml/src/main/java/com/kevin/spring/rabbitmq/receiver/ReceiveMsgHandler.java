package com.kevin.spring.rabbitmq.receiver;

public class ReceiveMsgHandler {
    public void handleMessage(String text) {
        System.out.println("Received: " + text);
    }
}
