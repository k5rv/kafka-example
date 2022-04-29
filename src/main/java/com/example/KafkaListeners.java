package com.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

  @KafkaListener(topics = "example", groupId = "groupid")
  void listener(Message data) {
    System.out.println("Listener received: " + data + "🎉");
  }
}
