package com.yys.provider.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class c1Consumer {


    @KafkaListener(topics ="trust-topic2" , groupId = "myGroup1")
    public void consumerMessage(String msg){
        System.out.println("client 1 consumer: " +msg);

    }
}
