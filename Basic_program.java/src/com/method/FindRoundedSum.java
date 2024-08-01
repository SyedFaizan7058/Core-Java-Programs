package com.method;

public class FindRoundedSum {

	public static int getRoundedSum(int num1, int num2, int num3) {
		int sum = 0;
		int r = roundNumber(num1);
		sum += r;
		r = roundNumber(num2);
		sum += r;
		r = roundNumber(num3);
		sum += r;

		return sum;
	}

	public static int roundNumber(int n) {

		if (n % 10 < 5) {
			n /= 10;
			n *= 10;
		} else {

			if (n % 10 >= 5) {

				n /= 10;
				n++;
				n *= 10;
			}
		}

		return n;
	}
}
