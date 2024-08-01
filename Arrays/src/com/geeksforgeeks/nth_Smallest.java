package com.geeksforgeeks;

import java.util.Arrays;

public class nth_Smallest {

	public static int kthSmallest(int[] arr, int l, int r, int k) {

		Arrays.sort(arr);
		
		return arr[k-1];

	}

	public static void main(String[] args) {

		int arr[] = { 7, 10, 4, 20, 15 };
		System.out.println();
		System.out.println(kthSmallest(arr, 0, 5, 5));

	}

}
