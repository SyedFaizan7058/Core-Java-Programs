package com.employee_directory;

public class EmployeeDirectoryExample {

	public static void main(String[] args) {
		
		Directory d = new Directory();
		d.addEmployee(new Employee("Alice", "HR",12000.0));
		d.addEmployee(new Employee("Bob", "developer",30000.0));
		System.out.println("All employee Details...");
		d.displayAllEmployees();
		d.deleteEmployee();
		d.updateEmployee("Bob");

	}

}
