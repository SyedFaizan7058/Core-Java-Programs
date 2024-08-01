package com.copy_constructor;

public class Employee {

	private int employeeId;
	private String empployeeName;

	public Employee(int employeeId, String empployeeName) {
		super();
		this.employeeId = employeeId;
		this.empployeeName = empployeeName;
	}

	public String toString() {
		return "Employee [employeeId=" + employeeId + ", empployeeName=" + empployeeName + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmpployeeName() {
		return empployeeName;
	}

}
