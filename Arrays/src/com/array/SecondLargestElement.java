package com.array;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {

		int arr[] =RandomNumber.getRandomNumber(5,7);
		int size = arr.length;
		int temp = 0;
		int index=size-1;
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < size-1 ; i++) {
			for (int j = i+1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
        		
		for(;arr[index]==arr[size-1];) {
			index--;
		}
		System.out.println("Second Largest element :"+arr[index]);
	}

}
