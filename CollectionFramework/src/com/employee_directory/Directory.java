package com.employee_directory;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Directory {

	List<Employee> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public boolean addEmployee(Employee e) {

		return list.add(e);

	}

	public void displayAllEmployees() {

		ListIterator<Employee> li = list.listIterator();

		while (li.hasNext()) {
			System.out.println(li.next());
		}

	}

	public void updateEmployee(String name) {

		ListIterator<Employee> li = list.listIterator();
		Employee next = li.next();
		boolean contains = name.contains(next.getName());

		if (!contains) {
			System.out.println("Invalid Employee Name...");
		} else {

			System.out.print("Enter your new Position :");
			String p = sc.nextLine();
			p = sc.nextLine();
			System.out.print("Enter Your new Salary :");
			double s = sc.nextDouble();

			next.setPosition(p);
			next.setSalary(s);
			System.out.println("After update record...");
			displayAllEmployees();

		}

	}

	public void deleteEmployee() {

		System.out.print("Enter Your Index Position :");
		int i = sc.nextInt();
		System.out.println("Record Deleted Successfully...");

		list.remove(i);

	}

}
