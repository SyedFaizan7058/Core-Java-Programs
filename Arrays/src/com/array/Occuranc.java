package com.array;

import java.util.Arrays;

public class Occuranc {

	public static void main(String[] args) throws Exception {

		int arr[] = { 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2, 2, 1,
				1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1 };
		System.out.println(majorityElement(arr, arr.length));

	}

	// remove same element and find new array length
	public static int removeElement(int[] arr, int value) {

		int size = arr.length;
		int count = 0;
		int[] arr2 = new int[size];
		for (int i = 0, j = 0; i < size; i++) {
			if (arr[i] != value) {
				arr2[j] = arr[i];
				j++;

			} else {
				count++;
			}
		}
		arr = new int[size - count];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr2[i];
		}
		System.out.print("Length :");
		return arr.length;

	}

	public static void moveZeros(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == 0) {
				for (int j = i; j < i; j++) {
					arr[i] = arr[i + 1];

				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	// sum of two numbers
	public static int[] twoSum(int[] nums, int target) {

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		return null;
	}

	public static int removeDuplicates(int[] nums) {
		System.out.println(Arrays.toString(nums));

		int size = nums.length;
		int j = 1;
		for (int i = 0; i < size - 1; i++) {
			if (nums[i] != nums[i + 1]) {
				j++;
				System.out.print(nums[i] + " ");

			} else {
			}
		}

		return j;

	}

	public static void sort012(int a[], int n) {

		int count0 = 0, count1 = 0;
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				count0++;
			} else if (a[i] == 1) {
				count1++;
			}
		}

		for (int i = 0; i < n; i++) {
			if (count0 > 0) {
				a[i] = 0;
				count0--;
			} else if (count1 > 0) {
				a[i] = 1;
				count1--;
			} else {
				a[i] = 2;
			}
			System.out.print(a[i] + " ");
		}

	}

	// Find majority elements
	static int majorityElement(int a[], int size) {

		Arrays.sort(a);
		int temp = 0;
		int count = 1;

		for (int i = 0; i < size - 1; i++) {
			if (a[i] == a[i + 1]) {
				count++;
			} else {
				count = 1;
			}

			if (count > size / 2) {
				temp = a[i];
				break;
			}
		}

		if (temp != 0) {
			return temp;
		} else if (size == 1) {
			return a[0];
		} else {
			return -1;
		}
	}

	public static int removeElement2(int[] nums, int val) {

//		System.out.println(Arrays.toString(nums));

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index] = nums[i];
				index++;
			}
		}
		return index;

	}

	public static int[] rotateEle(int arr[]) {

		int temp = arr[0];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i];
		}
		arr[arr.length - 1] = temp;
		System.out.println(Arrays.toString(arr));
		return arr;

	}

	public static boolean IsPalindrome(int arr) {
		int originalNum = arr;
		int reverse = 0;

		if (arr > 9) {
			while (arr != 0) {
				int digit = arr % 10;
				reverse = reverse * 10 + digit;
				arr /= 10;
			}
		} else {
			System.out.println(arr + " Please provide two digit number!!");
		}
		return originalNum == reverse;
	}

}
