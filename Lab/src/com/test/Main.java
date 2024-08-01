package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		String[] input = { "hello", "how", "hello", "test", "how" };
		String[] result = getEqualStrings(input);
		System.out.println(Arrays.toString(result));
	}

	public static String[] getEqualStrings(String[] input) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();

		for (String str : input) {
			if (!set1.add(str)) {
				set2.add(str);
			}
		}

		return set2.toArray(new String[0]);
	}
}
