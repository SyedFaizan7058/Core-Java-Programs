package com.basic;

import java.util.Scanner;

public class AddTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the second number :");
		int b = sc.nextInt();
		System.out.println("Enter the third number :");
		int c = sc.nextInt();

		if (a + b == c) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		sc.close();
	}

}
