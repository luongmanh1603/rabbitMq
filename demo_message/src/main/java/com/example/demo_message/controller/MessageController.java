package com.example.demo_message.controller;

import com.example.demo_message.Service.MessagingService;
import com.example.demo_message.entity.MessageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {
    @Autowired
    private MessagingService messagingService;

    @PostMapping("/message")
    public void setMessagingService(@RequestBody MessageEntity messageEntity){
        this.messagingService.sendMessage(messageEntity.getMessage());

    }
}
