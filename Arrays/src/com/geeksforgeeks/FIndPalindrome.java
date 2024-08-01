package com.geeksforgeeks;

public class FIndPalindrome {

	static int isPalindrome(String str) {
		int size = str.length();
		for (int i = 0; i < size / 2; i++) {
			if (str.charAt(i) != str.charAt(size - 1 - i)) {
				return 0;
			}
		}
		return 1;

	}

	public static void main(String[] args) {

		String str = "abbb";

		System.out.println(isPalindrome(str));

	}

}
