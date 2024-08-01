package com.oops.employee;

public class Employee {

	private String employeeName;
	private String jobTitle;
	private double employeeSalary;

	public Employee(String employeeName, String jobTitle, double employeeSalary) {
		super();
		this.employeeName = employeeName;
		this.jobTitle = jobTitle;
		this.employeeSalary = employeeSalary;
		this.toString();
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", jobTitle=" + jobTitle + ", employeeSalary="
				+ employeeSalary + "]";
	}

	public String salaryUpdate() {

		if (employeeSalary >= 40000) {
			employeeSalary = employeeSalary + (employeeSalary * 0.12);

			System.out.println("Your Salary increased by 12%");

			return "Your Salary increased by 12%" + employeeSalary;
		} else {
			employeeSalary = employeeSalary + (employeeSalary * 0.08);

			System.out.println("Your Salary increased by 8%");

			return "Your Salary increased by 8%" + employeeSalary;

		}
	}

}
