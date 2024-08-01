package com.recurssion;

import java.util.function.Supplier;

class Student {

	private String name;
	private String id;
	private char grade;

	public Student(String name, String id, char grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

public class Student_Mian {

	public static void main(String[] args) {

		Supplier<Student> student = () -> new Student("Faizan", "101", 'A');

		Student student2 = student.get();
		System.out.println(student2);

	}

}
