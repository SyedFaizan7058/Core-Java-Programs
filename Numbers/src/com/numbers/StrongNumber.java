package com.numbers;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");

		int number = sc.nextInt();

		IntPredicate isTrue = num -> {

			int temp = num;
			int lastDigit;
			int factorial = 1;
			int strongNumber = 0;

			while (temp > 0) {

				lastDigit = temp % 10;
				for (int i = 1; i <= lastDigit; i++) {
					factorial *= i;
				}

				strongNumber += factorial;
				temp = temp / 10;
				factorial = 1;

			}
			return num == strongNumber;

		};
		if (isTrue.test(number)) {
			System.out.println(number + " is Strong number.");
		} else {
			System.out.println(number + " is not Strong number.");
		}

		sc.close();
	}
}
