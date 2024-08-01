package com.lab.instructor;

public class Instructor_Main {

	public static void main(String[] args) {

		Instructor i = new Instructor("Faizan");
		Course c = new Course("AB123", "Java Developer", i);

		System.out.println(c);

	}

}
