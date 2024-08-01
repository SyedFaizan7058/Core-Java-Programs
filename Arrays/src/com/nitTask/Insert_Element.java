package com.nitTask;

import java.util.Arrays;

import com.array.RandomNumber;

public class Insert_Element {

	public static void main(String[] args) {

		int arr[] = RandomNumber.getRandomNumber(5, 9);
		System.out.println(Arrays.toString(arr));
		int position = 3;
		int newNumber = 10;

		int arr2[] = new int[arr.length + 1];
//		arr2 = Arrays.copyOf(arr, arr2.length);

		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			if (i == position) {
//        		arr2[i+1]=arr[i];
//        		arr2[i+2]=arr[i+1];
				arr2[i] = newNumber;
			} else if (i > position) {
				arr2[i] = arr[i - 1];
			}
		}

		System.out.println(Arrays.toString(arr2));

	}

}
