package com.practice;

class Grand_Father {

	public void Land() {

		System.out.println("Grand Father have plot");
	}

}

class Father extends Grand_Father {

	public void House() {

		System.out.println("Father have Own Home");
	}

}

class Son extends Father {

	public void Car() {

		System.out.println("Son have Car ");
	}
}

public class Multi_Level_Inheritance {

	public static void main(String[] args) {

		Son s = new Son();
		s.Land();
		s.House();
		s.Car();

	}

}
