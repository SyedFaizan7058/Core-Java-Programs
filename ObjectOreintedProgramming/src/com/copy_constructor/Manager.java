package com.copy_constructor;

public class Manager {

	private int managerId;
	private String managerName;

	public Manager(Employee emp) {

		this.managerId = emp.getEmployeeId();
		this.managerName = emp.getEmpployeeName();
	}

	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + "]";
	}

}
