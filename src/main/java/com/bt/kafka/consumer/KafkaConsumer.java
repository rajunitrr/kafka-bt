package com.bt.kafka.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic", groupId = "test-group")
    public void receive(String message) {
        System.out.println("Consumed message: " + message);
    }
}
