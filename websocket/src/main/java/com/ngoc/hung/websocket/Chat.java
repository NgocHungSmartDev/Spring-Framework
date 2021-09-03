/**
 * Chat.java Sep 3, 2021
 * 
 * Copyright by NgocHung.
 * 
 * Last update Sep 3, 2021
 */
package com.ngoc.hung.websocket;

import lombok.Data;

@Data
public class Chat {

	private MessageType type;
	private String content;
	private String sender;

	public enum MessageType {
		CHAT, JOIN, LEAVE
	}

}
