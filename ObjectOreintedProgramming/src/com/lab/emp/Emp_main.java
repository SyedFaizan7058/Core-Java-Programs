package com.lab.emp;

import java.util.Scanner;

public class Emp_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("how many object you want??");
		System.out.print("Enter the number :");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			Employee emp = Employee.getEmployeeObject();
			System.out.println(emp);
		}
		sc.close();
	}

}
