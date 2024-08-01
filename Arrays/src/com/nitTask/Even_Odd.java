package com.nitTask;

import java.util.Arrays;

public class Even_Odd {

	public static int[] findEvens(int arr[]) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}

		int even[] = new int[count];
		int e = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[e] = arr[i];
				e++;
			}
		}

		return even;
	}

	public static int[] findOdds(int arr[]) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				count++;
			}
		}

		int odd[] = new int[count];
		int o = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				odd[o] = arr[i];
				o++;
			}
		}

		return odd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int[] evens = findEvens(arr);
		System.out.println(Arrays.toString(evens));

		int[] odds = findOdds(arr);
		System.out.println(Arrays.toString(odds));

	}

}
