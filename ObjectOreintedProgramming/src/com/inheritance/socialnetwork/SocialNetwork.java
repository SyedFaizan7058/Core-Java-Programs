package com.inheritance.socialnetwork;

public class SocialNetwork {

	public static void main(String[] args) {

		User user = new User("Alice");
		User user1 = new User("Bob");
		Friend friend = new Friend("Charlie");

		user.createPost("Hello, world!");
		user1.createPost("Java programming is fun!");

		friend.sendMessage(user, "How are you!!");
		friend = new Friend("David");
		friend.sendMessage(user, " Let's catch up sometime!");

	}

}
