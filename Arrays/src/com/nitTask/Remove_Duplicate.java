package com.nitTask;

import java.util.Arrays;

public class Remove_Duplicate {

	public static int[] removeDuplicateElement(int arr[]) {

		Arrays.sort(arr);
		int duplicate[] = new int[arr.length];
		duplicate[0]=arr[0];
		int count = 1;
		for (int i = 1, j = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				duplicate[j] = arr[i];
				j++;
				count++;
			}
		}
		arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = duplicate[i];
		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 6, 1,1,1,7, 3, 2, 4, 5, 6 };
		int[] duplicateElement = removeDuplicateElement(arr);
		System.out.println("After remove Duplicate elements : " + Arrays.toString(duplicateElement));

	}

}
