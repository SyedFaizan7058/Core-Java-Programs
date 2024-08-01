package com.geeksforgeeks;

public class BinarySearch {

	public static int binarysearch(int arr[], int n, int k) {

		for (int i = 0; i < n; i++) {
			if (arr[i] == k) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		int arr[] = { 11, 22, 33, 44, 55 };
		System.out.println(binarysearch(arr, arr.length, 4));

	}

}
