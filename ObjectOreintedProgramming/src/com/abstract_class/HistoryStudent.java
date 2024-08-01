package com.abstract_class;

public class HistoryStudent extends Student {

	private int historyMarks;
	private int civicsMarks;

	HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}

	@Override
	public int getPercentage() {

		if (historyMarks <= 100 && civicsMarks <= 100) {
			return (historyMarks + civicsMarks) / 2;
		} else {
			System.out.println("Oops Maximum is Marks 100!!!");
			return 0;
		}
	}

}
