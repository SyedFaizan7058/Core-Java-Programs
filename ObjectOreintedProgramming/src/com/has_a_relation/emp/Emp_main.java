package com.has_a_relation.emp;

public class Emp_main {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Fahad", 21, 25000, "Dev Department");
		Employee emp2 = new Employee(emp1);
		emp1.raiseSalary(10);
		System.out.println(emp1);
		System.out.println("------------------------------");
		System.out.println(emp2);

	}

}
