package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class PairsOfElementSumOfSpecificEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 2, 7, 4, -5, 11, 5, 20 };
		System.out.print("Enter the specific number :");
		int sum = sc.nextInt();
		int size = arr.length, flag = 0;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {

				if (sum == arr[i] + arr[j]) {

					System.out.println(arr[i] + "+" + arr[j] + "=" + sum);
					flag = 1;
				}
			}
		}
		if (flag == 0) {
			System.out.println("OOPS!! There is no posibility for this number");
		}

		sc.close();
	}

}
