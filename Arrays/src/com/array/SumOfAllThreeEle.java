package com.array;

public class SumOfAllThreeEle {

	public static void main(String[] args) {

		int arr[] = { 1, -2, 0, 5, -1, -4 };
		int sn = 2;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j != i && arr[i] + arr[j] == sn) {
					System.out.println(arr[i] + "" + arr[j] + "=" + sn);
				} else if (arr[i] + arr[j] > sn) {
					continue;
				} else if (arr[i] + arr[j] < sn) {
					for (int k = 0; k < arr.length; k++) {
						if (j != k && arr[i] + arr[j] + arr[k] == sn) {
							System.out.println("(" + arr[i] + ")+" + "(" + (arr[j]) + ")+" + "(" + (arr[k]) + ")=" + sn);
						}

					}
				}

			}
		}

	}

}
