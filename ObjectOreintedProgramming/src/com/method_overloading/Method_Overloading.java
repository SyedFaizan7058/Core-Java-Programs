package com.method_overloading;

class Overloading {

	public void PrintNumber(int x, char c) {

		System.out.println("x :" + x);
		System.out.println("c :" + c);
	}

	public void PrintNumber(char c, int x) {

		System.out.println("c :" + c);
		System.out.println("x :" + x);
	}
}

public class Method_Overloading {

	public static void main(String[] args) {

		Overloading o = new Overloading();
		o.PrintNumber(10, 'c');
		System.out.println("------------");
		o.PrintNumber('a', 20);

	}
}
