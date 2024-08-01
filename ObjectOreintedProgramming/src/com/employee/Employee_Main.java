package com.employee;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Employee_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(101, "Azim", 30000);

		Predicate<Employee> emp = employee -> {

			System.out.println("The salary of Employee is > 30000");
			return employee.getSalary() <= 30000;
		};
		System.out.println(emp.test(e));

		Consumer<Employee> employee = (emp2) -> System.out.println(emp2);
		employee.accept(e);

		e.EmployeeDesignation();

	}

}
