/**
 * WebSocketController.java Sep 3, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Sep 3, 2021
 */
package com.ngoc.hung.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.ngoc.hung.websocket.Chat;

@Controller
public class WebSocketController {

	@MessageMapping("/chat.sendMessage")
	@SendTo("/topic/publicChatRoom")
	public Chat sendMessage(@Payload Chat chat) {
		return chat;
	}

	@MessageMapping("/chat.addUser")
	@SendTo("/topic/publicChatRoom")
	public Chat addUser(@Payload Chat chat, SimpMessageHeaderAccessor headerAccessor) {
		// Add username in web socket session
		headerAccessor.getSessionAttributes().put("username", chat.getSender());
		return chat;
	}
}
