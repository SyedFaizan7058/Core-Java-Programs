package com.oops.rectangle;

public class Rectangle {

	private double height;
	private double width;

	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {

		double area = width * height;

		return area;
	}

	public double getPerimeter() {

		double perimeter = 2 * (height + width);

		return perimeter;
	}

}
