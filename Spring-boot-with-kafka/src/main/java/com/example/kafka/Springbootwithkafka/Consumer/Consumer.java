package com.example.kafka.Springbootwithkafka.Consumer;

import java.io.IOException;

import com.example.kafka.Springbootwithkafka.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	 @KafkaListener(topics = "users", groupId = "group_id")
	    public void consume(User message) throws IOException {
	        System.out.println("#### -> Consumed message -> %s"+ message.toString());
	    }
}
