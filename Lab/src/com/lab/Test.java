package com.lab;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {

		Supplier<Integer> random = () -> {

			Random randomNum = new Random();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the starting point :");
			int s = sc.nextInt();
			System.out.print("Enter the range :");
			int r = sc.nextInt();
			int nextInt = randomNum.nextInt(s, r);

			for (int i = 1; i <= nextInt; i++) {
				System.out.print(i + " ");

			}
			sc.close();
			return nextInt;

		};

		System.out.println(random.get());

	}
}