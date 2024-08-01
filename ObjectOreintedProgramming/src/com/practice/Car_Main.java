package com.practice;

class Car {

	private String make;
	private String model;
	private int year;

	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public void getDescription() {

		System.out.println("make " + make + ", model " + model + ", and year " + year);
	}

}

public class Car_Main {
	public static void main(String[] args) {

		Car car = new Car("Toyota", "Camry", 2021);
		car.getDescription();

	}

}
