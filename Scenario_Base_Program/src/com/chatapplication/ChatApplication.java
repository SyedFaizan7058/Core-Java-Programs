package com.chatapplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class User {
	private String username;

	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}
}

class Message {
	private User sender;
	private String content;

	public Message(User sender, String content) {
		this.sender = sender;
		this.content = content;
	}

	public User getSender() {
		return sender;
	}

	public String getContent() {
		return content;
	}
}

class ChatRoom {
	private Map<User, List<Message>> chatHistory;

	public ChatRoom() {
		this.chatHistory = new HashMap<>();
	}

	public void joinChat(User user) {
		chatHistory.put(user, new ArrayList<>());
	}

	public void leaveChat(User user) {
		chatHistory.remove(user);
	}

	public void sendMessage(User sender, User receiver, String content) {
		if (chatHistory.containsKey(sender) && chatHistory.containsKey(receiver)) {
			Message message = new Message(sender, content);
			chatHistory.get(receiver).add(message);
		} else {
			System.out.println("Invalid users. Make sure both users are in the chat.");
		}
	}

	public List<Message> getChatHistory(User user) {
		return chatHistory.getOrDefault(user, new ArrayList<>());
	}
}

public class ChatApplication {
	public static void main(String[] args) {
		User user1 = new User("Alice");
		User user2 = new User("Bob");

		ChatRoom chatRoom = new ChatRoom();

		// Users join the chat
		chatRoom.joinChat(user1);
		chatRoom.joinChat(user2);

		// Users exchange messages
		chatRoom.sendMessage(user1, user2, "Hello, Bob!");
		chatRoom.sendMessage(user2, user1, "Hi, Alice!");

		// Display chat history for each user
		List<Message> aliceChatHistory = chatRoom.getChatHistory(user1);
		List<Message> bobChatHistory = chatRoom.getChatHistory(user2);

		System.out.println("Chat History for Alice:");
		for (Message message : aliceChatHistory) {
			System.out.println(message.getSender().getUsername() + ": " + message.getContent());
		}

		System.out.println("\nChat History for Bob:");
		for (Message message : bobChatHistory) {
			System.out.println(message.getSender().getUsername() + ": " + message.getContent());
		}
	}
}
