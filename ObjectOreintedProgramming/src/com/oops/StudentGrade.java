package com.oops;

import java.util.*;

public class StudentGrade {

	// class variables
	private int studentId;
	private String studentName;
	private int marks;
	private char grade;

	// set class variables studentId, studentName and marks
	public void setStudentData(int studentId, String studentName, int marks) {

		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;

	}

	// set class variable grade value using conditions
	public void calculateGrade() {

		if (marks > 90) {
			grade = 'A';
		} else if (marks > 80) {
			grade = 'B';
		} else if (marks > 70) {
			grade = 'C';
		} else if (marks > 60) {
			grade = 'D';
		} else {
			grade = 'E';
		}

	}

	// display student details as per the format provided in question
	public String displayDetails() {
		String studentDetails = "";

		studentDetails = "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks
				+ ", grade=" + grade + "]";

		return studentDetails;
	}

	// An ELC(Executable Logic class) class with main method to test your co

	public static void main(String args[]) {

		StudentGrade faizan = new StudentGrade();

		// create object to Student class

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Id :");
		int id = sc.nextInt();

		System.out.print("Enter Name :");
		String name = sc.nextLine();
		name = sc.nextLine();

		System.out.print("Enter marks :");
		int marks = sc.nextInt();
		sc.close();

		// call setStudentData method by passing studentId, name and marks
		faizan.setStudentData(id, name, marks);

		// call calculateGrade method to calculate grade
		faizan.calculateGrade();

		// call displayDetails method to print student details in given format
		String result = faizan.displayDetails();

		System.out.print(result);
	}

}
