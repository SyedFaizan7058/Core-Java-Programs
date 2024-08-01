package com.functionalInterface;

import java.util.function.Predicate;

public class Palindrom {

	public static void main(String[] args) {

		int n = 121;

		Predicate<Integer> isPalindrome = x -> {

			int original = x;
			int rev = 0;

			while (x > 0) {

				rev = rev * 10 + x % 10;
				x /= 10;
			}
			return rev == original;
		};

		if (isPalindrome.test(n)) {

			System.out.println("It is a palindrome");

		} else {

			System.out.println("It is not a palindrome");
		}

	}

}
