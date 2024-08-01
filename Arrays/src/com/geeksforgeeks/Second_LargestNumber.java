package com.geeksforgeeks;

public class Second_LargestNumber {

	public static int secondLargest(int arr[], int n) {

		int max = arr[0];
		int secondMax = -1;
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				secondMax = max;
				max = arr[i];
			} else {
				if (secondMax < arr[i] && max != arr[i]) {
					secondMax = arr[i];
				}
			}
		}
		return secondMax;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 5, 10 };
		System.out.println(secondLargest(arr, arr.length));

	}

}
