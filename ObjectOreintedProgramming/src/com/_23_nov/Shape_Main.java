package com._23_nov;

abstract class Shape {

	public abstract double getArea();

}

class Circle extends Shape {

	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 3.14 * radius * radius;
	}

}

class Rectangle extends Shape {

	double width;
	double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

}

public class Shape_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c = new Circle(4);
		System.out.println("Area of circle :" + c.getArea());
		Rectangle r = new Rectangle(4, 5);
		System.out.println("Area of Rectangle :" + r.getArea());

	}

}
