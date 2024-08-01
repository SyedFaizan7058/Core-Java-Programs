package com.assosiation.student;

import java.util.Scanner;

public class Trainer {

	public static void viewStudentDetail(Student s) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter student id :");
		int id = sc.nextInt();

		if (id == s.getStudentId()) {

			System.out.println(s);
		} else {

			System.out.println("Id not found !!!");
		}
		sc.close();
	}

}
