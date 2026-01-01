package com.yys.consumer.feign.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class c2consumerConfig {
    private final KafkaTemplate<String,String> kafkaTemplate;

    public c2consumerConfig(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }

    @KafkaListener(topics = "trust-topic1",groupId="myGroup2")
    public void consumeMsg(String msg){
        System.out.println("Client 2 received: " + msg);
        kafkaTemplate.send("trust-topic2", "welcome to client 2");
    }

}
