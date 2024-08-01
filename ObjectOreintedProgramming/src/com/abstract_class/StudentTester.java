package com.abstract_class;

public class StudentTester {

	public static void main(String[] args) {

		ScienceStudent s = new ScienceStudent("Affan", "Java-25", 80, 80, 80);
		s.studetnDetail();
		int result = s.getPercentage();
		System.out.println("ScienceStudent Percentage :" + result);
		result = Student.getTotalNoStudents();
		System.out.println("Total no of student :" + result);

		System.out.println("--------------------------------------");

		HistoryStudent h = new HistoryStudent("Taha", "Java-25", 101, 70);
		h.studetnDetail();
		result = h.getPercentage();
		System.out.println("HistoryStudent Percentage :" + result);
		result = Student.getTotalNoStudents();
		System.out.println("Total no of student :" + result);

		System.out.println("--------------------------------------");

		s = new ScienceStudent("Azim", "Java-25", 80, 89, 80);
		s.studetnDetail();
		result = s.getPercentage();
		System.out.println("ScienceStudent Percentage :" + result);
		result = Student.getTotalNoStudents();
		System.out.println("Total no of student :" + result);

		System.out.println("--------------------------------------");

		s = new ScienceStudent("Fahad", "Java-25", 100, 80, 80);
		s.studetnDetail();
		result = s.getPercentage();
		System.out.println("ScienceStudent Percentage :" + result);
		result = Student.getTotalNoStudents();
		System.out.println("Total no of student :" + result);

	}

}
