package com.oops.rectangle;

public class GetRectangleData {

	public static void main(String[] args) {

		Rectangle r = new Rectangle(7, 12);
		double area = r.getArea();
		System.out.println("Area of trangle is :" + area);

		System.out.println("Perimeter of trangle :" + r.getPerimeter());

		System.out.println("-------------------------------");

		r.setHeight(6);
		r.setWidth(12);

		System.out.println("Area of trangle after modefiy is :" + r.getArea());

		System.out.println("Perimeter of trangle after modefiy is :" + r.getPerimeter());

	}

}
