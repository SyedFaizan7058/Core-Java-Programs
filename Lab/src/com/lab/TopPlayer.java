package com.lab;

public class TopPlayer extends Player {

	public TopPlayer(String name, int score) {
		super(name, score);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TopPlayer [getName()=" + getName() + ", getScore()=" + getScore() + "]";
	}

}
