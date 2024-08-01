package com.overload.volume;

public class Cylinder extends Shape {

	public double calculateVolume(double radius, double height) {

		final double PI = 3.14;

		return PI * radius * radius * height;
	}

}
