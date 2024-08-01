package com.collectionnotes;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;

	public Employee(Integer employeeId, String employeeName, Double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}

}

public class ArrayListCode {

	public static void main(String[] args) {

		// Coping one Collection data to another
		ArrayList<Employee> listOfEmployees = new ArrayList<>();
		listOfEmployees.add(new Employee(1, "A", 12000.89));
		listOfEmployees.add(new Employee(2, "B", 12000.89));
		listOfEmployees.add(new Employee(3, "C", 12000.89));

		// fetch data by using forEach method
		listOfEmployees.forEach(get -> System.out.println(get));

		// Will create ArrayList object with default capacity 10.
		@SuppressWarnings("unused")
		ArrayList<Integer> a1 = new ArrayList<>();

		// Will create an ArrayList object with user specified Capacity
		@SuppressWarnings("unused")
		ArrayList<Integer> a2 = new ArrayList<>();

		// sorting operation on arrayList
		ArrayList<Integer> a = new ArrayList<>();
		a.add(9);
		a.add(7);
		a.add(8);
		a.add(5);
		a.add(6);
		//predefine
		Collections.sort(a);
		System.out.println(a);

		//own program
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(i) > a.get(j)) {
					int temp = a.get(i);
					a.set(i, a.get(j));
					a.set(j, temp);
				}
			}
		}

		System.out.println(a);

	}

}
