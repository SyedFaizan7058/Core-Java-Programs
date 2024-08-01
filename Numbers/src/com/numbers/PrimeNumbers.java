package com.numbers;

public class PrimeNumbers {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {

			int sum = 0;
			for (int i = 2; i <= 50; i++) {
				sum += checkPrime(i);
			}
			System.out.println("Sum of Prime Numbers :"+sum);

		});
		t.start();
	}

	private static int checkPrime(int i) {
		int j = 2;
		for (; j <= i / 2; j++) {
			if (i % j == 0) {
				return 0;
			}
		}
		return i;
	}
}
