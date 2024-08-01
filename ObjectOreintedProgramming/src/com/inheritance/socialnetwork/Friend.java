package com.inheritance.socialnetwork;

public class Friend extends Person {

	public Friend(String name) {
		super(name);
	}

	public void sendMessage(User u, String massage) {

		System.out.println(this.getName() + " sent a message to " + u.getName() + ": Hi, " + u.getName() + " " + massage);

	}

}
