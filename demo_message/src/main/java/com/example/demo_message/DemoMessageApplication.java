package com.example.demo_message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMessageApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoMessageApplication.class, args);
        System.out.println("Started the application...");
    }

}
