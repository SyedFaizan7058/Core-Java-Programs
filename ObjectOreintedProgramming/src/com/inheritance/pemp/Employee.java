package com.inheritance.pemp;

public class Employee {

	protected int employeeNumber;
	protected String employeeName;
	protected String employeeAddress;

	public void setData(int employeeNumber, String employeeName, String employeeAddress) {

		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

//	@Override
//	public String toString() {
//		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeAddress="
//				+ employeeAddress + "]";
//	}

}
