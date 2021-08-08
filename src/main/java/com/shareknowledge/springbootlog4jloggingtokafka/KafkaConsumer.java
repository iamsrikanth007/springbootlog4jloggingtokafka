package com.shareknowledge.springbootlog4jloggingtokafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "${topic.name}")
    public void receive(SimpleMessage consumerMessage) {
        final String TEXT_RESET = "\u001B[0m";
        final String TEXT_GREEN = "\u001B[32m";
        System.out.println(TEXT_GREEN);
        System.out.println("*****************Received message from kafka queue : " + consumerMessage.getBody());
        System.out.println(TEXT_RESET);
    }
}
