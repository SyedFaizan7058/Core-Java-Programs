package com.array;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {
		
		int arr[]=RandomNumber.getRandomNumber(5, 15);
		
		int size=arr.length,sum=0;
		
		for(int i=0;i<size;i++) {
			
			sum+=arr[i];
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum:"+sum);
	 

	}

}
