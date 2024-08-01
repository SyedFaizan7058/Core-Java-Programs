package com.serialization.student;

import java.io.Serializable;
import java.util.Date;
import java.util.Scanner;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfAdmission;

	public Student(Integer studentId, String studentName, Double studentFees) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		Date d = new Date();
		this.dateOfAdmission = d;

	}

	public static Student getStudentObject() {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student id :");
		Integer id = sc.nextInt();
		System.out.print("Enter student name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter student fees :");
		Double fees = sc.nextDouble();
		sc.close();

		return new Student(id, name, fees);

	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}

}
