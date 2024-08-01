package com.lab.student;

public class Cource_Main {

	public static void main(String[] args) {

		Cource cource = new Cource("ABC123", "Java");
		Student student = new Student(101, "Faizan", cource);
		student.setGrade1(1);
		int grade1 = student.getGrade1();
		student.setGrade2(5);
		int grade2 = student.getGrade2();
		student.setGrade3(7);
		int grade3 = student.getGrade3();
		System.out.println("Grade 1 is :" + grade1 + " Grade 2 is :" + grade2 + " Grade 3 is :" + grade3);

	}

}
