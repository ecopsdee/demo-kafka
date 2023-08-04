package com.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
    @KafkaListener(topics = "demo_Topic", groupId = "demo_group")
    public void listenToTopic(String receivedMessage){
        System.out.println("Message received from Topic: ".concat(receivedMessage));
    }
}
