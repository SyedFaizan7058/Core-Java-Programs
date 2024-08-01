package com.array;

public class DifferenceInMaxAndMin {

	public static void main(String[] args) {

		int arr[] = { 5, 7, 2, 4, 9 };
		int min = arr[0];
		int max = arr[0],diff=1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
				diff=max-min;
			}
		}

		System.out.println("Minimum value :"+min);
		System.out.println("Maximun Value :"+max);
        System.out.println("Difference :"+diff);
	}

}
