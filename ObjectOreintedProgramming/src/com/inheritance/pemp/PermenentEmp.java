package com.inheritance.pemp;

public class PermenentEmp extends Employee {

	protected String department;
	protected String designation;

	public void setPempData(String department, String designation) {

		this.department = department;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "PermenentEmp [department=" + department + ", designation=" + designation + ", employeeNumber="
				+ employeeNumber + ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + "]";
	}

}
