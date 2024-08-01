package com.array;

import java.util.Arrays;

public class GetReverseArray {

	public static void main(String[] args) {
		
		int arr[]=RandomNumber.getRandomNumber(10, 25);
		int temp=0;
		
		System.out.println("Orignal array :"+Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
        
 		System.out.println(Arrays.toString(arr));
		
	}

}
