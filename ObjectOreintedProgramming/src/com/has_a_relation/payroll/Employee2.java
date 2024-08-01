package com.has_a_relation.payroll;

public class Employee2 {

	int empId;
	String empName;
	double basicSalary;
	double HRAper;
	double DAper;

	public Employee2(int empId, String empName, double basicSalary, double hRAper, double dAper) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.HRAper = hRAper;
		this.DAper = dAper;
	}

	public double calculateGrossSalary() {

		double grossSalary = basicSalary + HRAper + DAper;

		return grossSalary;
	}

	@Override
	public String toString() {
		return "Employee detail[empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", HRAper="
				+ HRAper + ", DAper=" + DAper + "]";
	}

}
