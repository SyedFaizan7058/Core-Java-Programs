package com.geeksforgeeks;

import java.util.Arrays;

public class TriplateSumInArray {

	public static boolean find3Numbers(int arr[], int n, int x) {

		Arrays.sort(arr);
		int sum = 0;
		for (int i = 0; i < n - 2; i++) {
			int j = i + 1;
			int k = n - 1;
			while (k > j) {
				sum = arr[i] + arr[j] + arr[k];
				if (sum == x) {
					return true;
				} else if (sum < x)
					j++;
				else
					k--;
			}

		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 557, 217, 627, 358, 527, 358, 338, 272, 870, 362, 897, 23, 618, 113, 718, 697, 586, 42, 424, 130,
				230, 566, 560, 933 };
		System.out.println(find3Numbers(arr, arr.length, 986));

	}

}
