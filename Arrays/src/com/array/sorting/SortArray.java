package com.array.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int temp = 0;
		System.out.print("Enter array size :");
		int size = sc.nextInt();
		System.out.print("Enter the array element :");
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print(Arrays.toString(arr));
//		for (int y : arr) {
//			System.out.print(" " + y);
//		}
		sc.close();
	}

}
