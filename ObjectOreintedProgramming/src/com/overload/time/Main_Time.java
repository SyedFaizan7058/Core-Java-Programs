package com.overload.time;

public class Main_Time {

	public static void main(String[] args) {

		Time time = new Time();
		System.out.println(time);
		time = new Time(2);
		System.out.println(time);
		time = new Time(3, 45);
		System.out.println(time);
		time = new Time(1, 30, 15);
		System.out.println(time);

	}

}
