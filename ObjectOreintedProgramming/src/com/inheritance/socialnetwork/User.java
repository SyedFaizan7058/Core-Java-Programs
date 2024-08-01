package com.inheritance.socialnetwork;

public class User extends Person {

	public User(String name) {
		super(name);
	}

	public void createPost(String content) {

		System.out.println(this.getName() + " created a post: " + content);
	}

}
