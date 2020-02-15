package com.example.kafka.Springbootwithkafka.producer;

import com.example.kafka.Springbootwithkafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	 private static final String TOPIC = "users";

	    @Autowired
	    private KafkaTemplate<String, User> kafkaTemplate;

	    public void sendMessage(User message) {
	        System.out.println("#### -> Producing message -> %s"+ message.toString());
	        this.kafkaTemplate.send(TOPIC, message);
	    }
}
