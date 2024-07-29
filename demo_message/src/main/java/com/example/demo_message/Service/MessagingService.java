package com.example.demo_message.Service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessagingService {
    @Value("${rabbitmq_routing_key}")
        private String routingKey;
    @Value("${rabbitmq.exchange.name}")
        private String exchange;

    RabbitTemplate rabbitTemplate;

    public MessagingService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(exchange, routingKey, message);
    }
}
