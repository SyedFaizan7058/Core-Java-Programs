package com.abstract_class;

public abstract class Student {

	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudent;

	public abstract int getPercentage();

	public static int getTotalNoStudents() {
		return totalNoOfStudent;
	}

	Student() {
		super();
		totalNoOfStudent++;
	}

	Student(String studentName, String studentClass) {

		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudent++;
	}

	public void studetnDetail() {
		System.out.println("Student Name :" + studentName);
		System.out.println("Student Class :" + studentClass);
	}

}
