package com.pay_roll_system;

public class Sourcing {

	int Id;
	String Name;
	double basicSalary;
	double HRAper;
	double DAper;
	int enrollmentTarget;
	int enrollmentReached;
	double perkPerEnrollment;

	public Sourcing(int id, String name, double basicSalary, double hRAper, double dAper, int enrollmentTarget,
			int enrollmentReached, double perkPerEnrollment) {
		super();
		Id = id;
		Name = name;
		this.basicSalary = basicSalary;
		HRAper = hRAper;
		DAper = dAper;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}

	public double calculateGrossSalary() {

		double grossSalary = basicSalary + HRAper + DAper
				+ ((enrollmentReached / enrollmentTarget) * 100) * perkPerEnrollment;

		return grossSalary;

	}

	@Override
	public String toString() {
		return "Sourcing detail[Id=" + Id + ", Name=" + Name + ", basicSalary=" + basicSalary + ", HRAper=" + HRAper
				+ ", DAper=" + DAper + ", enrollmentTarget=" + enrollmentTarget + ", enrollmentReached="
				+ enrollmentReached + ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}

}
