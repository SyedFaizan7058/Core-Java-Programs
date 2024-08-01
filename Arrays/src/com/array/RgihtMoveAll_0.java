package com.array;

import java.util.Arrays;

public class RgihtMoveAll_0 {

	public static void main(String[] args) {

		int arr[] =RandomNumber.getRandomNumber(10, 5);
		int size = arr.length, temp = 0;
		System.out.println("Orignel Array :" + Arrays.toString(arr));
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
				if (arr[i] > arr[j] && arr[i] != 0 && arr[j] != 0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
