package com.string;

public class CheckPalindrome {

	public static void main(String[] args) {

		String str = "mam";
		boolean flag = false;
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				flag = true;
			}
		}
		if (!flag)
			System.out.println("isPalindrome");
		else
			System.out.println("Not a palindrome");

	}

}
