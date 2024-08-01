package com.nitTask;

public class FIndIndex {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int element = 3;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == element)
				System.out.println("Index :" + i);
		}

	}

}
