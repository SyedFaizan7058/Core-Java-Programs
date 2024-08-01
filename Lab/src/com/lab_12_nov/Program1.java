package com.lab_12_nov;

abstract class Student {

	protected String studentName;
	protected String studentClass;
	protected static int totalNoOfStudents;

	public abstract int getPercentage();

	public static int getTotalNoStudents() {
		return totalNoOfStudents;
	}

	public Student() {

	}

	public Student(String studentName, String studentClass) {
		super();
		this.studentName = studentName;
		this.studentClass = studentClass;
		totalNoOfStudents++;
	}

}

class ScienceStudent extends Student {

	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;

	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathsMarks) {
		super("Faizan", "Zeeshan");
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public int getPercentage() {
		// TODO Auto-generated method stub
		return (physicsMarks + chemistryMarks + mathsMarks) / 3;
	}

}

class HistoryStudent extends Student {

	private int historyMarks;
	private int civicsMarks;

	public HistoryStudent(int historyMarks, int civicsMarks) {
		super("Taha", "Azim");
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	public int getPercentage() {
		// TODO Auto-generated method stub
		return (historyMarks + civicsMarks) / 2;
	}

}

public class Program1 {

	public static void main(String[] args) {

		ScienceStudent s = new ScienceStudent(80, 80, 80);
		System.out.println("Science Student Percentage :" + s.getPercentage());

		HistoryStudent h = new HistoryStudent(75, 75);
		System.out.println("History Student Percentage :" + h.getPercentage());

		System.out.println("Total no of student :" + Student.getTotalNoStudents());

		StringBuilder sb = new StringBuilder();
		StringBuilder append = sb.append(10);
		System.out.println(append);


	}

}
