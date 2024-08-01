package com._23_nov;

class Person {

	protected String name;
	protected int age;
	protected String gender;

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

}

class Employee extends Person {

	protected int employeeId;
	protected double salary;

	public Employee(String name, int age, String gender, int employeeId, double salary) {
		super(name, age, gender);
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public double getSalary() {
		return salary;
	}

}

class Manager extends Employee {

	protected String department;

	public Manager(String name, int age, String gender, int employeeId, double salary, String department) {
		super(name, age, gender, employeeId, salary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Manager [department=" + department + ", employeeId=" + employeeId + ", salary=" + salary + ", name="
				+ name + ", age=" + age + ", gender=" + gender + "]";
	}

}

public class Persom_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Manager m = new Manager("Faizan", 20, "Male", 101, 45000, "Dev Team");
		System.out.println(m);

	}

}
