package com.method_overloading;

public class Area {

	public static void main(String[] args) {

		area(4, 4);
		area(4);
	}

	public static void area(double length, double breadth) {

		System.out.println("area of rectangle :" + (length * breadth));

	}

	public static void area(double side) {

		System.out.println("area of square :" + (side * side));

	}

}
