package com.array.sorting;

import java.util.Arrays;

import com.array.RandomNumber;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = RandomNumber.getRandomNumber(7, 9);
		System.out.println("Befor Sortig :"+Arrays.toString(arr));
		int minIndex;
		for (int i = 0; i < arr.length; i++) {
			minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
		
		System.out.println("After Sorting :"+Arrays.toString(arr));

	}

}
