package com.practice;

import java.util.Arrays;

class Studentt {

	private String name;
	private int[] grade;

	public Studentt(String name, int[] grade) {
		super();
		this.name = name;
		this.grade = grade;
	}

	public double getAverageGrade() {
		int sum = 0;
		for (int g : grade) {
			sum += g;
		}
		return (double) sum / grade.length;

	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Studentt [name=" + name + ", grade=" + Arrays.toString(grade) + "]";
	}

}

class Classroom {

	public static void getAverageClassGrade(Studentt[] students) {

		for (Studentt student : students) {

			System.out.println(student);
			System.out.println("Average marks of class :" + student.getAverageGrade());

		}
	}
}

public class Student_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 90, 85, 69, 99 };

		Studentt s1 = new Studentt("Faizan", new int[] { 80, 75, 79, 91 });
		Studentt s2 = new Studentt("Azim", arr);
		Studentt s3 = new Studentt("Fahad", arr);
		Studentt s4 = new Studentt("Taha", arr);

		Studentt[] student = { s1, s2, s3, s4 };

		Classroom.getAverageClassGrade(student);

	}

}
