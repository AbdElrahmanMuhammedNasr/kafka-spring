package com.example.kafkaexample.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Send {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;


    @RequestMapping("/get")
    public void send() throws InterruptedException {
        for (int i = 0; i <10 ; i++) {
            kafkaTemplate.send("abdos","Hi abdos "+i);
            Thread.sleep(1000);
        }
    }

}
