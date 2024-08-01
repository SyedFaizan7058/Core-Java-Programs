package com.oops.employee;

public class EmployeeDetail {

	public static void main(String[] args) {

		Employee e = new Employee("Aasif", "Graphic Designer", 60000);
		e.salaryUpdate();
		System.out.println(e);

		System.out.println("---------------------------");

		Employee e2 = new Employee("Sohail", "Analiyst", 39000);
		e2.salaryUpdate();
		System.out.println(e2);

	}

}
