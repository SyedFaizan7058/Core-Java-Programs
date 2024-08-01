package com.lab.emp;

import java.util.Scanner;

public class Employee {

	private int employeeId;
	private String emoloyeeName;
	private double employeeSalary;

	public Employee(int employeeId, String emoloyeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.emoloyeeName = emoloyeeName;
		this.employeeSalary = employeeSalary;
	}

	public static Employee getEmployeeObject() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id :");
		int id = sc.nextInt();
		System.out.print("Enter name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter salary :");
		double sal = sc.nextDouble();

//		Employee e = new Employee(id, name, sal);

		return new Employee(id, name, sal);
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", emoloyeeName=" + emoloyeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}
