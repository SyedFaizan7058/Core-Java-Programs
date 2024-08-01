package com.has_a_relation.payroll;

public class Manager {

	int managerId;
	String ManagerName;
	double basicSalary;
	double HRAper;
	double DAper;
	double projectAllowance;

	public Manager(int managerId, String managerName, double basicSalary, double hRAper, double dAper,
			double projectAllowance) {
		super();
		this.managerId = managerId;
		ManagerName = managerName;
		this.basicSalary = basicSalary;
		HRAper = hRAper;
		DAper = dAper;
		this.projectAllowance = projectAllowance;
	}

	public double calculateGrossSalary() {

		double grossSalary = basicSalary + HRAper + DAper + projectAllowance;

		return grossSalary;

	}

	@Override
	public String toString() {
		return "Manager detail[managerId=" + managerId + ", ManagerName=" + ManagerName + ", basicSalary=" + basicSalary
				+ ", HRAper=" + HRAper + ", DAper=" + DAper + ", projectAllowance=" + projectAllowance + "]";
	}
}
