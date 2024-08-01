package com._2_JAN;

public class Program2 {

	public static void percentageOfCharacters(String str) {

		if (str.equals(null) || str.equals(" ")) {
			System.out.print("Invalid String Input!!");
			return;
		}
		int ch = 0;
		int digit = 0;
		int spec = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
				ch++;
			} else if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				digit++;
			} else if (str.charAt(i) != ' ') {
				spec++;
			}

		}
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				count++;
		}
		System.out.println("Charecter :" + (ch * 100) / (str.length() - count) + "%");
		System.out.println("Digits :" + (digit * 100) / (str.length() - count) + "%");
		System.out.println("special charecter :" + (spec * 100) / (str.length() - count) + "%");

	}

	public static void main(String[] args) {

		percentageOfCharacters("jgvug1@!");
	}

}
