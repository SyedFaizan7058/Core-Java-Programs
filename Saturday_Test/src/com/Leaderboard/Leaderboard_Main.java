package com.Leaderboard;

public class Leaderboard_Main {

	public static void main(String[] args) {
		
		TopPlayer t1=new TopPlayer("Alice", 500);
		TopPlayer t2=new TopPlayer("Bob", 480);
		System.out.println("Top Player :");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println("---------------------------------------");
		RegularPlayer r1=new RegularPlayer("Charlie", 350);
		RegularPlayer r2=new RegularPlayer("David",320);
		System.out.println("Regular Player :");
		System.out.println(r1);
		System.out.println(r2);
 
	}

}
