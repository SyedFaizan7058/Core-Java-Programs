package com.oops;

public class Virat {

	public static void main(String[] args) {

		Player virat = new Player();
		virat.setPlayerData(18, "CHIKU");
		String playerData = virat.getPlayerData();
		System.out.println(playerData);

		Player rohit = new Player();
		rohit.setPlayerData(45, "HITMAN");
		playerData = rohit.getPlayerData();
		System.out.println(playerData);

	}

}
