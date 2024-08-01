package com.geeksforgeeks;

import java.util.ArrayList;
import java.util.Arrays;


public class List_duplicate {

	public static ArrayList<Integer> duplicates(int arr[], int n) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		Set<Integer> set = new HashSet<Integer>();
		Arrays.sort(arr);
		boolean flag = false;
		int result = -1;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				if (result != arr[i]) {
					numbers.add(arr[i]);
					flag = true;
					result = arr[i];
				}
			}
		}

//		numbers.addAll(set);
		if (flag) {
			return numbers;
		} else {
			numbers.add(-1);
			return numbers;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 3, 4, 12, 3, 12, 3, 4, 4, 12, 7, 11, 6, 5 };
//		int arr[] = { 2, 0, 3, 3, 1 };
		System.out.println(duplicates(arr, arr.length));

	}

}
