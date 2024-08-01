package com.inheritance;

class Student {

	protected int studentId;
	protected String name;
	protected double examFee;

	Student(int studentId, String name, double examFee) {

		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;

	}

	public String toString() {
		return "Student[name=" + name + ",studentId=" + studentId + ",examFee=" + examFee + "]";
	}

	public String displayDetails() {
		return "" + toString();
	}

	public double payFee() {

		return 0;
	}

}

class Hosteller extends Student {
	protected double hostelFee;

	Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);

		this.hostelFee = hostelFee;
	}

	public void payFee(double amount) {

		double totalFee = examFee + hostelFee;
		double remainingAmount = totalFee - amount;

		if (remainingAmount < 1) {
			System.out.println("all fees are clear");
		} else {
			System.out.println("Remaining amount to pay is :" + remainingAmount);
		}
	}

	public String displayDetails() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
}

class DayScholar extends Student {

	private double transportFee;

	DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;

	}

	public void payFee(double amount) {

		double totalFee = examFee + transportFee;
		double remainingAmount = totalFee - amount;

		if (remainingAmount < 1) {
			System.out.println("all fees are clear");
		} else {
			System.out.println("Remaining amount to pay is :" + remainingAmount);
		}

	}

	public String displayDetails() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
}

//ELC class to test our code
public class TestStudent {

	public static void main(String[] args) {

		Student s = new Student(1, "Syed Faizan", 25000);
		String displayDetails = s.displayDetails();
		System.out.println(displayDetails);

		System.out.println("-------------------------------------------");

		DayScholar d = new DayScholar(2, "Syed Zeeeshan", 25000, 5000);
		String string = d.displayDetails();
		System.out.println(string);
		d.payFee(18000);

		System.out.println("-------------------------------------------");

		Hosteller h = new Hosteller(3, "Virat Kohli", 25000, 8000);
		String details = h.displayDetails();
		System.out.println(details);
		h.payFee(33000);

	}

}
