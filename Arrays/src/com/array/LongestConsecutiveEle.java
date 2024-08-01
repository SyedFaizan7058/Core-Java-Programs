package com.array;

public class LongestConsecutiveEle {

	public static void main(String[] args) {
		
		int arr[]= {49,1,3,200,2,4,70,5};
		int size=arr.length,temp=0;
		System.out.println("Orignal length :"+size);
		
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}

	}

}
