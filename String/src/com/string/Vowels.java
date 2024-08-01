package com.string;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcd";
		char[] cs = str.toCharArray();

		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			if (cs[i] == 'a' || cs[i] == 'e' || cs[i] == 'i' || cs[i] == 'o' || cs[i] == 'u') {
				flag = true;
			}
		}

		System.out.println("Contains Vowel :" + flag);
		System.out.println("Contains Vowel :" + containsVowel(str));

	}

	private static boolean containsVowel(String str) {

		return str.matches(".*[aeiouAEIOU].*");
	}

}
