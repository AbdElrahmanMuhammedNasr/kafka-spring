package com.example.kafkaexample.Config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    @KafkaListener(groupId = "foo",topics = {"abdos"})
    public void listen1(String in) {
        System.out.println(in);
    }
}
