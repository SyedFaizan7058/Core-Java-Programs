package com.saturday.gradingsystem;

public class GradingSystem {

	public static void main(String[] args) {

		UndergraduateStudent u = new UndergraduateStudent("Fahad");

		u.addGrade(82);
		u.addGrade(73);
		u.addGrade(80);
		u.calculateGPA();
		u.Transcript();

		System.out.println("----------------------------------------");

		GraduateStudent g = new GraduateStudent("Azeem");

		g.addGrade(80);
		g.addGrade(79);
		g.addGrade(62);
		g.calculateGPA();
		g.Transcript();

	}

}
