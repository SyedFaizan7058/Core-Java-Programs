package com.overload.volume;

public class Sphere extends Shape {

	public double calculateVolume(double radius) {

		final double PI = 3.14;

		return (4.0/ 3.0) * PI * radius * radius;
	}

}
