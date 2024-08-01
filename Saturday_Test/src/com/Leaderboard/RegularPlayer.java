package com.Leaderboard;

public class RegularPlayer extends Player {

	public RegularPlayer(String name, int score) {
		super(name, score);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RegularPlayer [Name=" + getName() + ", Score=" + getScore() + "]";
	}

}
