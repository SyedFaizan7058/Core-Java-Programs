package com.abstract_class;

public class ScienceStudent extends Student {

	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;

	ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public int getPercentage() {
		return (physicsMarks + chemistryMarks + mathsMarks) / 3;
	}
}
