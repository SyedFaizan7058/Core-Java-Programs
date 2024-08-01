package com.oops;

public class Manager {

	int managerId;
	String managerName;
	String managerAddress;
	double managerSal;
	char managerGrade;

	public void setManagerData(int id, String name, String add, double sal) {

		managerId = id;
		managerName = name;
		managerAddress = add;
		managerSal = sal;

	}

	public void getGrade() {

		if (managerSal >= 100000) {
			managerGrade = 'A';
		} else if (managerSal >= 80000) {
			managerGrade = 'B';
		} else if (managerSal >= 60000) {
			managerGrade = 'C';
		} else {
			managerGrade = 'D';
		}
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + ", managerName=" + managerName + ", managerAddress=" + managerAddress
				+ ", managerSal=" + managerSal + ", managerGrade=" + managerGrade + "]";
	}

}
