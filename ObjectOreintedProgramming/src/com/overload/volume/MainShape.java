package com.overload.volume;

public class MainShape {

	public static void main(String[] args) {

		Cube cube = new Cube();
		System.out.println("Volume of the Cube :" + cube.calculateVolume(3));

		Cylinder c = new Cylinder();
		System.out.println("Volume of the Cylinder :" + c.calculateVolume(2, 2));

		Sphere s = new Sphere();
		System.out.println("Volume of the Sphere :" + s.calculateVolume(1.84));

	}

}
