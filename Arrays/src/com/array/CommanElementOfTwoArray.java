package com.array;

import java.util.Arrays;

public class CommanElementOfTwoArray {

	public static void main(String[] args) {

		int arr1[] = RandomNumber.getRandomNumber(5, 10);
		int arr2[] = RandomNumber.getRandomNumber(5, 10);
		int temp = 0;

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					temp = arr1[i];
					System.out.println("Comman element is :" +temp);
                   
				}
				 
			}
		}

	}

}
