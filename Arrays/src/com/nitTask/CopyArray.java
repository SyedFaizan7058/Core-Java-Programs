package com.nitTask;

import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		System.out.println("Orignal Array :" + Arrays.toString(arr));
		int arr2[] = new int[arr.length];
		arr2 = Arrays.copyOf(arr, arr2.length);
		System.out.println("Copied Array :" + Arrays.toString(arr2));

	}

}
