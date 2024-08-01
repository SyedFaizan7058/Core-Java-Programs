package com.numbers;

import java.util.Scanner;

public class AutomorphicNumber {

	public String isAutomophicNumber(int num) {
		int sq = num * num;
		if (num < 0) {
			return "-1";
		} else if (num == 0) {
			return "-2";
		}

		else if (num == sq % 100) {
			return "true";
		}

		return "false";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number :");
		int num = sc.nextInt();

		AutomorphicNumber an = new AutomorphicNumber();

		String result = an.isAutomophicNumber(num);

		if (result == "true") {
			System.out.println("isAutomophicNumber");
		} else if (result == "-1") {
			System.out.println("-1");
		} else if (result == "-2") {
			System.out.println("-2");
		} else {
			System.out.println("not isAutomophicNumber");
		}

		sc.close();
	}

}
