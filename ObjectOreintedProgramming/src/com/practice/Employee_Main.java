package com.practice;

class Employee {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

}

class Payroll {

	public void calculatePayroll(Employee[] emp) {

		double sum = 0;
		for (Employee employee : emp) {

			sum += employee.getSalary();
		}

		System.out.println("sum of all employee salaries :" + sum);

	}

}

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Faizan", 30000);
		Employee e2 = new Employee("Taha", 35000);
		Employee e3 = new Employee("Azim", 40000);
		Employee e4 = new Employee("Affan", 45000);

		Employee[] employeeArray = { e1, e2, e3, e4 };

		Payroll p = new Payroll();
		p.calculatePayroll(employeeArray);

	}

}
