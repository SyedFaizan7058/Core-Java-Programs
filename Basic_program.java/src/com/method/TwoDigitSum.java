package com.method;

import java.util.*;

class TwoDigitsSum {
	public int getSumOfDigits(int num) {

		int sum = 0, rem = 0;
		if (num < 0) {

			return -3;
		} else if (num > 99) {

			return -2;
		} else if (num > 0 && num < 9) {

			return -1;
		} else if (num > 10 && num < 99) {

			for (; num >= 1; num /= 10) {
				rem = num % 10;
				sum += rem;
			}
		}

		return sum;
	}
}

public class TwoDigitSum {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number :");
		int num = sc.nextInt();

		TwoDigitsSum gsd = new TwoDigitsSum();
		int val = gsd.getSumOfDigits(num);

		if (num >= 10 && num <= 99) {

			System.out.print("The sum of digit :" + val);

		} else if (num > 0 && num < 9) {

			System.out.print("Plz provide Two digit number! :" + val);
		} else {

			System.out.print("The number is zero OR -ve! :" + val);
		}

		sc.close();
	}
}
