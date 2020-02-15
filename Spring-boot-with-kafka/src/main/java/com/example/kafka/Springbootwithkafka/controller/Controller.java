package com.example.kafka.Springbootwithkafka.controller;

import com.example.kafka.Springbootwithkafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.kafka.Springbootwithkafka.producer.Producer;

@RestController
@RequestMapping(value = "/kafka")
public class Controller {

    @Autowired
       Producer producer;


    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestBody User user) {
        producer.sendMessage(user);
    }
}
