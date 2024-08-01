package com._20_nov;

import java.util.Arrays;

class Student {

	private String name;
	private int age;
	private int[] grade;

	public Student(String name, int age, int[] grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public double getAverageGrade() {

		int sum = 0;
		for (int g : grade) {
			sum += g;
		}
		return (double) sum / grade.length;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", grade=" + Arrays.toString(grade) + "]";
	}

}

class Classroom {

	public void getStudentsAboveAverage(Student[] students) {

		for (Student student : students) {

			System.out.println(student);
			System.out.println("Average marks of the class :" + student.getAverageGrade());
		}
	}
}

public class Student_Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int[] arr = { 80, 75, 92, 99 };

		Student s1 = new Student("Faizan", 20, arr);
		Student s2 = new Student("Taha", 21, arr);
		Student s3 = new Student("Azim", 22, arr);
		Student s4 = new Student("Fahad", 23, arr);

		Student[] student = { s1, s2, s3, s4 };

		Classroom c = new Classroom();
		c.getStudentsAboveAverage(student);

	}

}
