package com.yys.provider.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class c1Producer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public c1Producer(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate= kafkaTemplate;
    }

    public void sendMessage(){
        for(int i =0;i<10;i++) {
            System.out.println(i+"."+" client 1 producer send message" );

            kafkaTemplate.send("trust-topic1", "Hello World");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("thread is Interrupted");
            }

            System.out.println(" client 1 producer");
        }
    }
}
