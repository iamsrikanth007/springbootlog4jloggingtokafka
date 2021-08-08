package com.shareknowledge.springbootlog4jloggingtokafka;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class KafkaSender {

    private final KafkaProducer kafkaProducer;

    @GetMapping("/send/{message}")
    public void sendData(@PathVariable String message) {
        this.kafkaProducer.send(message);
    }
}
