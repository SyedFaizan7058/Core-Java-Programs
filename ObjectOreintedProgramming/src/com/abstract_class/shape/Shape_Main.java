package com.abstract_class.shape;

public class Shape_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle(30.3, 45.4);
		r.printDetails();
		System.out.println("--------");
		Circle c = new Circle(23.2);
		c.printDetails();
		System.out.println("--------");
		Triangle t = new Triangle(146.2, 40.0);
		t.printDetails();

	}

}
