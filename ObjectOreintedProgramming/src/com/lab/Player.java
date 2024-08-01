package com.lab;

public class Player {

	private String userName;
	private int score;
	private Achievement achievement;

	public Player(String userName, int score, Achievement achievement) {
		super();
		this.userName = userName;
		this.score = score;
		this.achievement = achievement;
	}

	public void unlockAchievement(String achivement_name) {

	}

	public String getAchievementStatus() {
		return null;
	}

	@Override
	public String toString() {
		return "Player [userName=" + userName + ", score=" + score + ", achievement=" + achievement + "]";
	}

}
