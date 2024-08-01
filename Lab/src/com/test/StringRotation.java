package com.test;

public class StringRotation {
	public static boolean isRotatedString(String str1, String str2) {

		String c = str1 + str1;

		return c.contains(str2);
	}

	public static void main(String[] args) {
		String str1 = "abcdef";
		String str2 = "defabc";

		boolean result = isRotatedString(str1, str2);
		System.out.println(result);

	}
}
