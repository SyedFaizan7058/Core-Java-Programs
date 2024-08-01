package com.array;

public class FindMinimum {

public static int getMinimumValue (int min){	 

		//int arr[] =RandomNumber.getRandomNumber(10, 25);
        int arr[]=new int[10];
		int size = arr.length;
		  min = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] > min) {
				min = arr[i];
			}
		}
		
		return min;
		//System.out.println(Arrays.toString(arr));
		//System.out.println("Minimum Value is :" + min);
	
  }
}
