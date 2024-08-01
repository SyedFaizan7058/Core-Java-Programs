package com.nitTask;

import java.util.Arrays;

public class Dlelete_Element {

	public static int[] deleteElement(int arr[], int element) {

		int size = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				for (int j = i; j < size - 1; j++) {
					arr[j] = arr[j + 1];
				}
			}

		}
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5 };
		int[] element = deleteElement(arr, 3);
		System.out.println(Arrays.toString(element));
		for(int i=0;i<arr.length;i++) {
        	System.out.print(element[i]+" ");
        }
	}

}
