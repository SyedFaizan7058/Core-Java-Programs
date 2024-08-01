package com.overload.vehicle;

public class Vehicle {

	private double totalDistance;
	private double totalFuelConsumed;

	public Vehicle(double totalDistance, double totalFuelConsumed) {
		super();
		this.totalDistance = totalDistance;
		this.totalFuelConsumed = totalFuelConsumed;
	}

	public double calculateFuelEfficiency() {

		double liter = totalDistance / totalFuelConsumed;

		return liter;

	}

	public double calculateFuelEfficiency(double miles, double gallons) {

		return (miles / gallons);

	}

}
