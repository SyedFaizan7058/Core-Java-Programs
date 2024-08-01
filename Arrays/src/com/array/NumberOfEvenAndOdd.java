package com.array;

import java.util.Arrays;

public class NumberOfEvenAndOdd {

	public static void main(String[] args) {

		int arr[] = RandomNumber.getRandomNumber(10, 10);
		int c1 = 0, c2 = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] != 0) {
				c1++;
			} else {
				if (arr[i] != 0)
					c2++;
			}
		}

		System.out.println("Number of even numbers :" + c1);
		System.out.println("Number of odd numbers :" + c2);

	}

}
