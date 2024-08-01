package com.array;

import java.util.Arrays;

public class FindMaxMin {

	
	public static void main(String[] args) {

		int arr[] = RandomNumber.getRandomNumber(10, 25);

		int size = arr.length;
		int temp=0;
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] > arr[0]) {
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Orignal Array :"+Arrays.toString(arr));
		System.out.println("min value is  :" + min);
		System.out.println("Max value is  :" + max);
		
		//Arrays.sort(arr);  //Array sorting function
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		 
		System.out.println("Sorted Array  :"+Arrays.toString(arr));
	}

}
