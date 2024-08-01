package com.array;

import java.util.Arrays;

public class InsertElement {

	public static void main(String[] args) {

		int arr[] = { 25, 14, 56, 15, 36 };
		int position = 3;
		int newNumber = 10;
		int size = arr.length + 1;

		int[] arr1 = new int[arr.length + 1];
		for(int i=0;i<arr.length;i++) {
        	arr1[i]=arr[i];
        }
		for (int i = 0; i < size; i++) {
//			if(i<p) {
//				arr1[i]=arr[i];
//			}
			if (i == position) {
				arr1[i] = newNumber;
			} else if (i > position) {
				arr1[i] = arr[i - 1];
			}

		}
		arr = null;

		System.out.println(Arrays.toString(arr1));

	}

}
