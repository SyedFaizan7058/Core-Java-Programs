package com.oops;

public class Dog {

	String dogName;
	double dogHeight;
	int dogAge;

	public void initializeProperties(String name, double height, int age) {

		dogName = name;
		dogHeight = height;
		dogAge = age;
	}

	public void getDogInformation() {
		System.out.print("My dog name is :" + dogName + "\nheight " + dogHeight + "\nand its age is " + dogAge);
	}

	public void bark() {
		System.out.print("\nA small dog barked at a seagull he was chasing.");
	}

	public static void main(String[] args) {

		Dog d = new Dog();
		d.initializeProperties("Tommy", 2.4, 3);
		d.getDogInformation();
		d.bark();

	}

}
