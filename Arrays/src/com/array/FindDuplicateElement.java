package com.array;

import java.util.Arrays;

public class FindDuplicateElement {

	public static void main(String[] args) {

		int arr[] = RandomNumber.getRandomNumber(5, 5);
		int temp = 0, c = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && (i != j)) {
					c++;
					System.out.println("Duplicate Element : " + arr[j] + " it appears " + c + " times");

					temp = arr[j];

				}
			}
		}

		System.out.println("The duplicate element is " + temp + " it appears " + c + " times");
	}

}
