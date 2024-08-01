package com.overload.vehicle;

public class Car extends Vehicle {

	public Car(double totalDistance, double totalFuelConsumed) {
		super(totalDistance, totalFuelConsumed);
	}

	public double calculateFuelEfficiency() {
		return super.calculateFuelEfficiency() * 2.35215;

	}

}
