package com.oops;

public class ParameterizedConstructor {
	public static void main(String[] args) {
		Horse h1 = new Horse("ABC", 4.4, 5);
		System.out.println(h1);

		System.out.println("..............");
		Horse h2 = new Horse("DEF", 5.0, 3);
		h2.setHorseName("GHI");
		System.out.println(h2);

		h2 = new Horse("JKL", 0, 0);
		System.out.println("..............");
		System.out.println(h2);

		Horse h3 = new Horse("XYZ", 5, 4);
		System.out.println("..............");
		System.out.println(h3);

	}
}