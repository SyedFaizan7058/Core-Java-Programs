package com.employee;

public class Employee {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void EmployeeDesignation() {

		if (getSalary() == 30000) {

			System.out.println("The Designation of an Employee is :" + Designation.MANAGER);

		} else if (getSalary() > 25000 && getSalary() < 30000) {

			System.out.println("The Designation of an Employee is :" + Designation.SR_DEVELOPER);

		} else if (getSalary() >= 10000 && getSalary() <= 25000) {

			System.out.println("The Designation of an Employee is :" + Designation.JR_DEVELOPER);

		} else {

			System.out.println("The Designation of an Employee is :" + Designation.TRAINEE);

		}
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
