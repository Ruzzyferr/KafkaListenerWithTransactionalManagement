package com.example.transactionalmanagement;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "kafkaApp",
            groupId = "my-group-id"
    )
    void litener(String s){
        System.out.println("Listener Received: " + s + "❤️");
    }

}
