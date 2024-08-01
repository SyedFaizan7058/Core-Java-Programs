package com.practice;

import java.util.Arrays;

public class Practice {

	public static boolean isAnagram(String a, String b) {
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		String s1 = new String(c1);
		String s2 = new String(c2);

		return s1.equals(s2);
	}

	public static void main(String[] args) {

		String s1 = "geeksforgeeks";
		String s2 = "forgeeksgeeks";
		System.out.println(isAnagram(s1, s2));

	}

}
