package com.geeksforgeeks;

import java.util.ArrayList;

public class Leaders_Array {

	static ArrayList<Integer> leaders(int arr[], int n) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		int temp = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] >= arr[j]) {
					temp = arr[i];
					continue;
				} else {
					temp = 0;
					break;
				}

			}
			if (temp != 0) {
				numbers.add(temp);
			}

		}

		numbers.add(arr[n-1]);
		return numbers;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 16, 17, 4, 3, 5, 2 };
		System.out.println(leaders(arr, arr.length));

	}

}
