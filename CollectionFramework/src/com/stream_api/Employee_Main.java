package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Employee {

	private int age;
	private String name;
	private double salary;
	private String department;

	public Employee(int age, String name, double salary, String department) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}

public class Employee_Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(26, "Affan", 30000, "Testing");
		Employee e2 = new Employee(25, "Azim", 25000, "Development");
		Employee e3 = new Employee(25, "Fahad", 20000, "Development");
		Employee e4 = new Employee(22, "Faizan", 25000, "Testing");

		List<Employee> list = Arrays.asList(e1, e2, e3, e4);
		list.stream();

		SortedSet<Integer> r = new TreeSet<>();
		r.add(3);
		r.add(2);
		r.add(1);
		System.out.println(r);

//		Map<String, Employee> collect = list.stream().collect(Collectors.toMap(employee -> employee.getDepartment(),
//				employee -> employee, (e11, e22) -> e1.getSalary() > e2.getSalary() ? e1 : e2));

//		list.stream().filter(l -> l.getAge() > 25).forEach(l -> l.setSalary(l.getSalary() + l.getSalary() * 0.10));

//		collect.forEach((department, employee) -> System.out
//				.println("Department: " + department + ", Highest Paid Employee: " + employee));

	}

}
