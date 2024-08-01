package com.nitTask;

public class Min_Max {

	public static int findMin(int[] arr) {

		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int findMax(int[] arr) {

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2,9,3,7,1,4};
		System.out.println("Minimum value from array :" + findMin(arr));
		System.out.println("Maximum value from array :" + findMax(arr));
	}

}
