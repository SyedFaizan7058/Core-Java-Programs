package com.nitTask;

import java.util.Arrays;

public class Sort_Array {

	public static int[] sortArray(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 4, 3, 2, 1 };
		int[] sortArray = sortArray(arr);
		System.out.println(Arrays.toString(sortArray));

	}

}
