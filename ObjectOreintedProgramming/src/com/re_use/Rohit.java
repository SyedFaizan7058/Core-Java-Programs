package com.re_use;

import com.oops.Player;

public class Rohit {

	public static void main(String[] args) {

		Player faizan = new Player();
		faizan.setPlayerData(1, "FAIZU");
		String playerData = faizan.getPlayerData();
		System.out.println(playerData);
	}

}
