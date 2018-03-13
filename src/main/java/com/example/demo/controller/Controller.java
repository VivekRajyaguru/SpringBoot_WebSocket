package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import com.example.demo.model.User;
import com.example.demo.model.UserResponse;

@org.springframework.stereotype.Controller
public class Controller {

	@MessageMapping("/user")
	@SendTo("/topic/user")
	public UserResponse getMessage(User user) {
		
		return new UserResponse("Hi " + user.getName());
	}
	
}
