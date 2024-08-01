package com.numbers;

import java.util.function.IntPredicate;
import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int number = sc.nextInt();

		IntPredicate isArmstrong = num -> {

			int orignalNum = num;
			int armstrongNum = 0;
			String str = "" + num;

			for (int i = 0; i <= str.length(); i++) {

				int check = num % 10;
				int power = 1;

				for (int j = 1; j <= str.length(); j++) {

					power *= check;
				}

				armstrongNum += power;

				num /= 10;

			}

			return armstrongNum == orignalNum;

		};

		if (isArmstrong.test(number)) {

			System.out.println(number + " is Armstrong");

		} else {

			System.out.println(number + " is not Armstrong");
		}

		sc.close();

	}
}
