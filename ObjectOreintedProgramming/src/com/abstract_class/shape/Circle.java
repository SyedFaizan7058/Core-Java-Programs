package com.abstract_class.shape;

public class Circle extends Shape {

	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		double area = PI * radius * radius;
		return area;
	}

	@Override
	public double printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Type :" + getClass().getSimpleName());
		System.out.println("Radius :" + getRadius());
		System.out.println("Area :" + getArea());
		return 0;
	}

}
