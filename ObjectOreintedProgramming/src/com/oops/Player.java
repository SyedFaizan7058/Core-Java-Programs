package com.oops;

public class Player {

	int playerId;
	String playerName;

	public void setPlayerData(int id, String name) {

		playerId = id;
		playerName = name;

	}

	public String getPlayerData() {

		return "Player[player id is :" + playerId + " player name is :" + playerName + "]";
	}

}
