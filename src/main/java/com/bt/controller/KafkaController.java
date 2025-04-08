package com.bt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bt.producer.KafkaProducer;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer) {
        this.producer = producer;
    }

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        producer.send(message);
        return "Message sent: " + message;
    }
}
