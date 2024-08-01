package com.functionalInterface.predicate;

class Student {

	private String name;
	private int id;
	private char grade;

	public Student(String name, int id, char grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", grade=" + grade + "]";
	}

}

public class StudentIdDistributer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
