package com.example.demo_consumer.configurations;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitmqConfig {
    @Value("${rabbitmq.queue.name}")
    public String queueName;
    @Value("${rabbitmq.exchange.name}")
    public String exchangeName;
    @Value("${rabbitmq_routing_key}")
    public String routingKey;


    @Bean
    public Queue queue() {
        return new Queue(queueName);
    }
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(exchangeName);
    }
    @Bean
    public Binding binding() {
        return BindingBuilder
                .bind(queue())
                .to(exchange())
                .with(routingKey);
    }



}
