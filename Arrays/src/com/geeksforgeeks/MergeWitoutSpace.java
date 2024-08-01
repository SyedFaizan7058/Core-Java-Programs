package com.geeksforgeeks;

import java.util.Arrays;

public class MergeWitoutSpace {

	public static void merge(long arr1[], long arr2[], int n, int m) {
		int i = 0;
		int j = 0;
		int k = n - 1;

		while (i <= k && j < m) {
			if (arr1[i] < arr2[j])
				i++;
			else {
				long temp = arr2[j];
				arr2[j] = arr1[k];
				arr1[k] = temp;
				j++;
				k--;
			}
		}
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long arr1[] = { 1, 3, 5, 7 };
		long arr2[] = { 0, 2, 6, 8, 9 };
		merge(arr1, arr2, arr1.length, arr2.length);

	}

}
