package com.exception;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
		System.out.println();

	}

	public static ArrayList<Integer> m1(int arr[]) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		boolean swapped;
		do {
			swapped = false;
			for (int i = 1; i < list.size(); i++) {
				if (list.get(i - 1) > list.get(i)) {
					int temp = list.get(i - 1);
					list.set(i - 1, list.get(i));
					list.set(i, temp);
					swapped = true;
				}
			}
		} while (swapped);
		return list;

	}

	public static String lastNonRepeated(String str) {
		String result = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			int count = 0;
			if (str.charAt(i) != ' ') {
				for (int j = 0; j < str.length(); j++) {
					if (((str.charAt(i) == str.charAt(j)) && i != j) && str.charAt(j) != ' ') {
						count++;
						break;
					}
				}
			}

			if (count == 0) {
				result += str.charAt(i);
				break;
			}
		}
		return result;
	}

}
