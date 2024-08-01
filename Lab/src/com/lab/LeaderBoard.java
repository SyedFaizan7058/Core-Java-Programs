package com.lab;

public class LeaderBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TopPlayer t=new TopPlayer("Alice", 500);
		System.out.println(t);
		t=new TopPlayer("Bob", 480);
		System.out.println(t);
		
		RegularPlayer r=new RegularPlayer("Charli", 350);
		System.out.println(r);
		r=new RegularPlayer("David", 320);
        System.out.println(r);
	}

}
