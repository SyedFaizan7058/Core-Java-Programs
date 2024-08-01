package com.geeksforgeeks;

public class Minimum_Jumps {

	public static int minJumps(int[] arr) {

		int c = 0;
		for (int i = 0, j = 0; i < arr.length - 1;) {

			c++;
			int max = 0;
			while (j <= i) {
				max = Math.max(max, i + arr[j++]);

			}
			if (max == 0)
				return -1;
			i = max;

		}

		return c;

	}

	public static void main(String[] args) {

		int arr[] = { 1, 4, 3, 2, 6, 7 };
		System.out.println(minJumps(arr));

	}

}
