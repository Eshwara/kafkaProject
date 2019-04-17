package com.taget.sample.listener;

import com.taget.sample.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics ="test", groupId = "group_id")
    public void consume(String message){

      System.out.println("Message is " + message);
    }

    @KafkaListener(topics = "testJson", groupId = "group_json", containerFactory = "userKafkaListenerFactory")
    public void consumeJson (User user){

        System.out.print("message received : " + user);
    }
}
