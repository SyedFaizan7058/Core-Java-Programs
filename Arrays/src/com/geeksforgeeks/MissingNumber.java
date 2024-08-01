package com.geeksforgeeks;

public class MissingNumber {

	static  int missingNumber(int[] arr, int n) {

		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			sum += arr[i];
		}

		return ((n * (n + 1)) / 2) - sum;

	}

	public static void main(String[] args) {

		int arr[] = { 1,2,3,5};
//		Arrays.sort(arr, Collections.reverseOrder());
		
		System.out.println(missingNumber(arr, arr.length));
		String s = "";
		char[] c = s.toCharArray();

	}

}
