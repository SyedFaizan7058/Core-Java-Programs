package com.saturday.gradingsystem;

public class Student {

	protected String name;
	protected int numCourse;
	protected int totalGradePoint;

	public Student(String name) {
		super();
		this.name = name;
	}

	public void addGrade(int grade) {

		totalGradePoint += grade;
		numCourse++;

	}

	public double calculateGPA() {

		if (numCourse == 0) {

			return 0;
		}

		return totalGradePoint / (double) numCourse;
	}

	public void Transcript() {

		System.out.println("Transcript for :" + name);
		System.out.println("Number of Courses :" + numCourse);
		System.out.println("Total Grade Points :" + totalGradePoint);
		System.out.println("GPA :" + calculateGPA());
	}

}
