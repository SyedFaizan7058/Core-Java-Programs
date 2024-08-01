package com.overload.time;

import java.lang.Math;

class Shape {

	public double calculateArea() {
		return 0;
	}
}

class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

class Rectangle extends Shape {
	private double length;
	private double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length * width;
	}
}

class Triangle extends Shape {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return 0.5 * base * height;
	}

}

public class Main_Area {

	public static void main(String[] args) {

		Circle circle = new Circle(5.0);
		System.out.println("Circle Area: " + circle.calculateArea());

		Rectangle rectangle = new Rectangle(4.0, 6.0);
		System.out.println("Rectangle Area: " + rectangle.calculateArea());

		Triangle triangle = new Triangle(3.0, 4.0);
		System.out.println("Triangle Area: " + triangle.calculateArea());

	}
}
