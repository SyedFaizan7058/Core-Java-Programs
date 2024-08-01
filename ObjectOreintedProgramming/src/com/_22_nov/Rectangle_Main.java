package com._22_nov;

class Rectangle {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (height + width);
	}

	public boolean isSquare() {

		return width == height;
	}

}

public class Rectangle_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle(4, 4);
		System.out.println("Area of rectangle :" + r.getArea());
		System.out.println("Perimeter of rectangle :" + r.getPerimeter());
		System.out.println("isSquare :" + r.isSquare());

	}

}
