package com.pay_roll_system;

public class Tax_util {

	double tax;

	public double calculateTax(Employee2 emp) {

		double salary = emp.calculateGrossSalary();

		if (salary > 30000) {
			tax = salary * 0.2;
		} else {
			tax = salary * 0.05;
		}

		return tax;
	}

	public double calculateTax(Manager manager) {

		double salary = manager.calculateGrossSalary();

		if (salary > 30000) {
			tax = salary * 0.2;
		} else {
			tax = salary * 0.05;
		}

		return tax;
	}

	public double calculateTax(Trainer trainer) {

		double salary = trainer.calculateGrossSalary();

		if (salary > 30000) {
			tax = salary * 0.2;
		} else {
			tax = salary * 0.05;
		}

		return tax;
	}

	public double calculateTax(Sourcing sourcing) {

		double salary = sourcing.calculateGrossSalary();

		if (salary > 30000) {
			tax = salary * 0.2;
		} else {
			tax = salary * 0.05;
		}

		return tax;
	}

}
