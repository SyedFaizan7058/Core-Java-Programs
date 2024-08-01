package com.string;

import java.util.Arrays;

interface test {

	char[] sortedString(String str);
}

public class SortedString {

	public static char[] sortedString(String str) {

		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length - 1; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (charArray[i] > charArray[j]) {
					char temp = charArray[i];
					charArray[i] = charArray[j];
					charArray[j] = temp;
				}
			}
		}

		return charArray;

	}

	public static void main(String[] args) {

		String str = "faizan";
		test t = SortedString::sortedString;
		char[] sortedString = t.sortedString(str);
		System.out.println(Arrays.toString(sortedString));

	}

}
