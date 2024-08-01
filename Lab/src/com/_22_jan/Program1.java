package com._22_jan;

interface User {

	String getUserName();

	void displayProfile();
}

interface Friendship {

	void addFriend(User user);

	void displayFriends();
}

interface Post {

	void addLike(User user);

	void addComment(User user, String comment);

	void displayPostDetails();
}

class SocialNetworkUser implements User, Friendship, Post {

	private String username;
	private SocialNetworkUser[] friends;
	private int friendCount;
	private int likes;
	private String[] comments;
	private int commentCount;

	public SocialNetworkUser(String username, SocialNetworkUser[] friends, int friendCount, int likes,
			String[] comments, int commentCount) {
		super();
		this.username = username;
		this.friends = friends;
		this.friendCount = friendCount;
		this.likes = likes;
		this.comments = comments;
		this.commentCount = commentCount;
	}

	@Override
	public void addLike(User user) {

	}

	@Override
	public void addComment(User user, String comment) {

		System.out.println(user.getUserName() + ":" + comment);

	}

	@Override
	public void displayPostDetails() {

		System.out.println("Post Details for :" + username);
		System.out.println("Likes :" + likes);

	}

	@Override
	public void addFriend(User user) {

	}

	@Override
	public void displayFriends() {

		for (SocialNetworkUser s : friends) {
			System.out.println(s);
		}

	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return this.username;
	}

	@Override
	public void displayProfile() {

		System.out.println("Friends of User2 :"+ getUserName());

	}

}

public class Program1 {

	public static void main(String[] args) {

		String[] arr = { "Great post!!" };

		SocialNetworkUser s = new SocialNetworkUser("User1", null, 1, 1, arr, 1);
		s.addFriend(s);
		s.displayProfile();
		s.displayPostDetails();
		s.addComment(s, "Great post!!");

	}

}
