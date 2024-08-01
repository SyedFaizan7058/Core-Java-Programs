package com.interface_;

import java.util.Scanner;

class Calculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				sum += i;
				System.out.print(i + " ");
			}

		}
		return sum;
	}

}

public class MyCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt();
		System.out.print("Divisors of " + n + " are ");
		Calculator c = new Calculator();
		int sum = c.divisorSum(n);
		System.out.println("\nSum of Divisors = " + sum);

		sc.close();

	}

}
