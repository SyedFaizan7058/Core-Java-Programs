package com.array.sorting;

import java.util.Arrays;

import com.array.RandomNumber;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[]= RandomNumber.getRandomNumber(6, 20);
		
		int size=arr.length;
		int temp=0,flag=0;
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		
		
		System.out.print(Arrays.toString(arr));
 
	}

}
