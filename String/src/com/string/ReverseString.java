package com.string;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {

		String str = "faizan";
		char[] cs = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println("Using Predefin :" + sb);

		for (int i = 0, j = cs.length - 1; i < cs.length / 2; i++, --j) {
			char temp = cs[j];
			cs[j] = cs[i];
			cs[i] = temp;

		}

		System.out.println("Logically :" + Arrays.toString(cs));

	}

}
