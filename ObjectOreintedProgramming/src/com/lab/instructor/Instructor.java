package com.lab.instructor;

public class Instructor {

	private String instructorName;

	public Instructor(String instructorName) {
		super();
		this.instructorName = instructorName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	@Override
	public String toString() {
		return "Instructor [instructorName=" + instructorName + "]";
	}

}
