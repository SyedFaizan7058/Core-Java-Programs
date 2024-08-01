package com.has_a_relation.payroll;

import java.util.*;

public class PaySalary {

	public static void main(String[] args) {

		System.out.println("----------- CHOOSE WHAT YOU WANT FROM BELOW  ------------");
		System.out.println("\t     1) Employee Gross Salary");
		System.out.println("\t     2) Manager Gross Salary");
		System.out.println("\t     3) Trainer Gross Salary");
		System.out.println("\t     4) Total Sourcing");
		System.out.println("---------------------------------------------------------");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		System.out.println("---------------------------------------------------------");

		switch (choice) {

		case 1:
			Employee2 employee = new Employee2(101, "Shaikh Azher", 25000, 2500, 1500);
			Tax_util tax = new Tax_util();
			double employeeTax = tax.calculateTax(employee);
			System.out.println(employee);
			System.out.println("Employee gross salary :" + employee.calculateGrossSalary());
			System.out.println("Tax of employee :" + employeeTax);

			System.out.println("------------------------------------------------------");
			break;

		case 2:
			Manager manager = new Manager(102, "Hashmi Taha", 35000, 2500, 1500, 1000);
			Tax_util mgrTax = new Tax_util();
			double managerTax = mgrTax.calculateTax(manager);
			System.out.println(manager);
			System.out.println("Manager gross salary :" + manager.calculateGrossSalary());
			System.out.println("Tax of manager :" + managerTax);

			System.out.println("-------------------------------------------------------");
			break;

		case 3:
			Trainer trainer = new Trainer(103, "Mohammad Azimoddin", 40000, 2500, 1500, 3, 500);
			Tax_util traTax = new Tax_util();
			double trainerTax = traTax.calculateTax(trainer);
			System.out.println(trainer);
			System.out.println("Trainer gross salary :" + trainer.calculateGrossSalary());
			System.out.println("Tax of trainer :" + trainerTax);

			System.out.println("-------------------------------------------------------");
			break;

		case 4:
			Sourcing sourcing = new Sourcing(104, "Syed fahad", 45000, 2500, 1500, 1000, 2000, 2100);
			Tax_util srcTax = new Tax_util();
			double sourcingTax = srcTax.calculateTax(sourcing);
			System.out.println(sourcing);
			System.out.println("Total Sourcing :" + sourcing.calculateGrossSalary());
			System.out.println("Tax of sourcing :" + sourcingTax);

			System.out.println("---------------------------------------------------------");
			break;

		default:

		}

		sc.close();

	}

}
