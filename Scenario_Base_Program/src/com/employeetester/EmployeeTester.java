package com.employeetester;

class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;

	public void setEmployeeId(int employeeId) {

		this.employeeId = employeeId;
	}

	public int getEmployeeId() {

		return employeeId;
	}

	public void setEmployeeName(String employeeName) {

		this.employeeName = employeeName;
	}

	public String getEmployeeName() {

		return employeeName;
	}

	public void setSalary(double salary) {

		this.salary = salary;
	}

	public double getSalary() {

		return salary;
	}

	public Employee() {

	}

	public Employee(int employeeId, String employeeName, double salary) {
		// Initialize Instance Variable
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

}

enum ManagerType {
	
	HR, SALES;
}

class Manager extends Employee {

	private ManagerType type;

	public Manager() {
		
	}

	public Manager(int employeeId, String employeeName, double salary, ManagerType type) {
		
		super(employeeId, employeeName, salary);
		this.type = type;
		this.setSalary(salary);
	}

	@Override
	public void setSalary(double salary) {

		if (type == ManagerType.HR) {

			super.setSalary(salary + 10000);
		}
		if (type == ManagerType.SALES) {

			super.setSalary(salary + 5000);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "Manager [type=" + type + "]";
	}

}

// Clerk

class Clerk extends Employee {
	// Declare Instances Variable
	private int speed;
	private int accuracy;
	// Define Getter and Setters Methods

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getAccuracy() {
		return speed;
	}

	public Clerk() {
		// Initialize Instance Variable
	}

	public Clerk(int employeeId, String employeeName, double salary, int speed, int accuracy) {
		// Initialize Instance Variable
		super(employeeId, employeeName, salary);
		this.speed = speed;
		this.accuracy = accuracy;
	}

	@Override
	public void setSalary(double salary) {
		// Write Logic Here
		if (speed > 70 && accuracy > 80) {

			super.setSalary(salary + 1000);
		} else {

			super.setSalary(salary + 0);
		}
	}

	@Override
	public String toString() {
		return super.toString() + "Clerk [speed=" + speed + ", accuracy=" + accuracy + "]";
	}

}

public class EmployeeTester {
	public static void main(String[] args) {
		// Create Object And Execute Methods
		Manager manager = new Manager(101, "Taha", 40000, ManagerType.SALES);
		System.out.println(manager);
		System.out.println("------------------------------------------------");
		Clerk clerk=new Clerk(102, "Zeeshan", 10000, 75, 85);
		double salary = clerk.getSalary();
		clerk.setSalary(salary);
		System.out.println(clerk);
		System.out.println("------------------------------------------------");
		clerk.setSpeed(100);
		clerk.setAccuracy(95);
		System.out.println(clerk);
	}
}