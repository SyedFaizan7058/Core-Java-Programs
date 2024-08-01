package com.lab.instructor;

public class Course {

	private String courceCode;
	private String courceName;
	private Instructor instructor;

	public Course(String courceCode, String courceName, Instructor instructor) {
		super();
		this.courceCode = courceCode;
		this.courceName = courceName;
		this.instructor = instructor;
	}

	public String getCourceCode() {
		return courceCode;
	}

	public String getCourceName() {
		return courceName;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	@Override
	public String toString() {
		return "Course [courceCode=" + courceCode + ", courceName=" + courceName + ", instructor=" + instructor + "]";
	}

}
