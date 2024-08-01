package com.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonElement {

	static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {

		ArrayList<Integer> numbers = new ArrayList<>();

		for (int i = 0; i < n1; i++) {
			if (i < n1 - 1 && A[i] == A[i + 1])
				continue;
			for (int j = 0; j < n2; j++) {
				if (A[i] == B[j]) {
					int size = numbers.size();
					numbers.add(A[i]);
//					while (k >= 0) {
//						if (C[k] == A[i]) {
//							numbers.add(A[i]);
//							break;
//						} else
//							k--;
//					}

					if (size != numbers.size())
						break;
				}

			}
		}

		ArrayList<Integer> result = new ArrayList<>();
		for (Integer num : numbers) {
			boolean common = false;
			for (int j = 0; j < n3; j++) {
				if (num.equals(C[j])) {
					common = true;
					break;
				}
			}
			if (common) {
				result.add(num);
			}
		}

		return numbers.isEmpty() ? new ArrayList<>(Arrays.asList(-1)) : numbers;

	}

	public static ArrayList<Integer> common(int A[], int B[], int C[], int n1, int n2, int n3) {

		Set<Integer> setA = new LinkedHashSet<>(Arrays.asList(Arrays.stream(A).boxed().toArray(Integer[]::new)));
		Set<Integer> setB = new LinkedHashSet<>(Arrays.asList(Arrays.stream(B).boxed().toArray(Integer[]::new)));
		Set<Integer> setC = new LinkedHashSet<>(Arrays.asList(Arrays.stream(C).boxed().toArray(Integer[]::new)));

		setA.retainAll(setB);
		setA.retainAll(setC);

		return new ArrayList<>(setA);

	}

	public static String longestCommonPrefix(String[] str) {

		if (str == null || str.length == 0) {
			return "";
		}

		String pr = str[0];

		for (int i = 1; i < str.length; i++) {
			while (str[i].indexOf(pr) != 0) {
				pr = pr.substring(0, pr.length() - 1);

				if (pr.isEmpty()) {
					return "";
				}
			}
		}

		return pr;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

//		int arr1[] = { 1, 5, 10, 20, 40, 80 };
//		int arr2[] = { 6, 7, 20, 80, 100 };
//		int arr3[] = { 3, 4, 15, 20, 40, 30, 70, 80, 120 };
//
//		System.out.println(common(arr1, arr2, arr3, arr1.length, arr2.length, arr3.length));

		String[] str = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(str));

	}

}
