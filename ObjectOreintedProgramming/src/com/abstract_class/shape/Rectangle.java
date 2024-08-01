package com.abstract_class.shape;

public class Rectangle extends Shape {

	double length;
	double breadth;

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = length * breadth;
		return area;
	}

	@Override
	public double printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Type :" + getClass().getSimpleName());
		System.out.println("Length :" + getLength());
		System.out.println("Breadth :" + getBreadth());
		System.out.println("Area :" + getArea());
		return 0;
	}

}
