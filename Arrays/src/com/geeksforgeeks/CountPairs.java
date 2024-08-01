package com.geeksforgeeks;

public class CountPairs {

	public static int getPairsCount(int[] arr, int n, int k) {

		int newArray[] = new int[101];
		int count = 0;
		int result = 0;
		for (int i = 0; i < n; i++) {
			result = k - arr[i];
			if (result >= 0 && result <= 100) {
				count += newArray[result];
			}

			newArray[arr[i]]++;
		}
		return count;

	}

	public static void main(String[] args) {
		
		int arr[] = { 1, 5, 7, 1,1 };
		System.out.println(getPairsCount(arr, arr.length, 6));

	}

}
