package com._18_NOV;

public class MaxOccurrence {

	public static void main(String[] args) {
		String input = "javaaavvabaavvvvvv";
		String result = maxOccurrence(input);
		System.out.println(result);
	}

	public static String maxOccurrence(String str) {
		if (str == null || str.isEmpty()) {
			return "invalid String input";
		}

		int[] charFrequency = new int[256];

		for (char c : str.toCharArray()) {
			charFrequency[c]++;
		}

		char maxChar = 0;
		int maxFrequency = 0;

		for (int i = 0; i < charFrequency.length; i++) {
			if (charFrequency[i] > maxFrequency) {
				maxFrequency = charFrequency[i];
				maxChar = (char) i;
			}
		}

		return maxChar + " " + maxFrequency + " time";
	}
}
