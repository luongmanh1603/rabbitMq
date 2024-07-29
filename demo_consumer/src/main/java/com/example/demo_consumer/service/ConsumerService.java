package com.example.demo_consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void consumeMessage(String message) {
        System.out.println("Message received: " + message);
    }
}
