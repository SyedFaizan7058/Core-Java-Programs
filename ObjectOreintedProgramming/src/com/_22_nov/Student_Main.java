package com._22_nov;

class Student {

	private String name;
	private int age;
	private int grade1;
	private int grade2;
	private int grade3;

	public Student(String name, int age, int grade1, int grade2, int grade3) {
		super();
		this.name = name;
		this.age = age;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.grade3 = grade3;
	}

	public double getAverageGrade() {

		return (grade1 + grade2 + grade3) / 3;

	}

	public boolean isPassing() {

		return getAverageGrade() >= 70;
	}

	public boolean isFailing() {

		return getAverageGrade() < 70;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade1() {
		return grade1;
	}

	public void setGrade1(int grade1) {
		this.grade1 = grade1;
	}

	public int getGrade2() {
		return grade2;
	}

	public void setGrade2(int grade2) {
		this.grade2 = grade2;
	}

	public int getGrade3() {
		return grade3;
	}

	public void setGrade3(int grade3) {
		this.grade3 = grade3;
	}

}

public class Student_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student("Faizan", 20, 80, 90, 92);
		System.out.println("Average grade of student :" + s.getAverageGrade());
		System.out.println("isPassing? :" + s.isPassing());
		System.out.println("isFailing? :" + s.isFailing());

	}

}
