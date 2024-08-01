package com.abstract_class.shape;

public class Triangle extends Shape {

	double base;
	double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = 0.5 * base * height;
		return area;
	}

	@Override
	public double printDetails() {
		// TODO Auto-generated method stub
		System.out.println("Type :" + getClass().getSimpleName());
		System.out.println("Base :" + getBase());
		System.out.println("Height :" + getHeight());
		System.out.println("Area :" + getArea());
		return 0;
	}

}
