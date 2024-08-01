package com.overload.vehicle;

public class Vehicle_Main {

	public static void main(String[] args) {

		Vehicle v = new Vehicle(10, 1);
		System.out.println("Fuel Efficiency (km/l): " + v.calculateFuelEfficiency());

		System.out.println("Fuel Efficiency (miles/gallon):" + v.calculateFuelEfficiency(10, 1));

		Car c = new Car(10, 1);
		System.out.println("Car Fuel Efficiency (miles/gallon)" + c.calculateFuelEfficiency());

	}

}
