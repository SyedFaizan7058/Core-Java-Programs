package com.array;

import java.util.Arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {

		int arr[] = RandomNumber.getRandomNumber(5, 10);

		System.out.println(Arrays.toString(arr));

		int size = arr.length, temp = 0;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					if (arr[j] > arr[i]) {
						temp = arr[1];
					}
				}
			}
		}

		System.out.println(Arrays.toString(arr));
		System.out.println("Second lowest element is :" + temp);
	}

}
