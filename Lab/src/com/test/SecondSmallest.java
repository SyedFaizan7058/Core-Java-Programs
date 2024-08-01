package com.test;

public class SecondSmallest {

	public static void main(String[] args) {
		int arr[] = {10,2,8,1,7,9,11,5,3};

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

		System.out.println("Second lowest element is :" + temp);
	}

}
