package com.lab;

public class Player_main {

	public static void main(String[] args) {

		Achievement a = new Achievement("1st prize", true);

		String achivementName = a.getAchivementName();
		System.out.println("Achivement Name :" + achivementName);

		Player p = new Player(achivementName, 85, a);
		System.out.println(p);
	}
}
