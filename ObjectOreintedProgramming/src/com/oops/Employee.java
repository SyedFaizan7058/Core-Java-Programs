package com.oops;

public class Employee {

	int empNo;
	double empSal;

	public void setEmployeeData(int empNo, double empSal) {
//		
//		empNo=101;
//		empSal=2500;
		this.empNo = empNo;
		this.empSal = empSal;
		this.toString();
	}
//	public void getEmployeeData() {
//		
//		System.out.println("Emp number is :"+empNo);
//		System.out.println("Emp salary is :"+empSal);
//
//	}

	@Override
	public String toString() {
		return "Employee [empNo=" + this.empNo + ", empSal=" + this.empSal + "]";
	}

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.setEmployeeData(101, 2500);
		System.out.println(emp);

	}

}
