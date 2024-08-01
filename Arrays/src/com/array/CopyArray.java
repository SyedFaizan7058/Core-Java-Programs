package com.array;

public class CopyArray {

	public static void main(String[] args) {

		int[] arr = RandomNumber.getRandomNumber(5, 20);
		int size=arr.length;
		System.out.print("Orignal array :");
		int newarr[]=new int[5];
		
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\nCopy array :");
		
		for (int i = 0; i < size; i++) {
			newarr[i] = arr[i];
			System.out.print(newarr[i]+" ");
		}

	}

}
