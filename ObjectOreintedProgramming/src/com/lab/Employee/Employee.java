package com.lab.Employee;

public class Employee {

	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;

	public Employee(int employeeNumber, String employeeName, double employeeSalary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getEmployeeSalary() {
		if (employeeSalary == 90000) {
			System.out.println("Employee is a Developer");
		} else if (employeeSalary == 60000) {
			System.out.println("Employee is a Designer");
		} else if (employeeSalary == 40000) {
			System.out.println("Employee is a Tester");
		}
		return employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}
