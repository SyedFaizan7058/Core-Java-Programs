package com.geeksforgeeks;

import java.util.ArrayList;

public class SubarraySum {

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		ArrayList<Integer> result = new ArrayList<>();
		int sum = 0;
		int left = 0, right = 0;

		while (right < n) {
			sum += arr[right];

			while (sum > s && left<=right) {
				sum -= arr[left];
				left++;
			}

			if (sum == s && left<=right) {
				result.add(left + 1);
				result.add(right + 1);
				return result;
			}

			right++;
		}

		result.add(-1);
		return result;
	}

	public static void main(String[] args) {
		
		int arr[] = { 9, 4, 20, 3, 10, 5};
		System.out.println(subarraySum(arr, arr.length, 10));

	}

}
