package com.has_a_relation.employee;

public class EmployeeData {

	public static void main(String[] args) {

		Address ad = new Address("UDGIR", "LATUR", "MAHARASHTRA");

		Employee faizan = new Employee(101, "Faizan", ad);

		System.out.println(faizan);
	}

}
