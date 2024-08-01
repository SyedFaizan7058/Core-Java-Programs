package com.array;

import java.util.Arrays;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		int arr[]= {0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(arr));
		int size=arr.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					 arr[j]=arr[j+1];
					 size--;
				}
				  
				 
			}
			 
		}
        System.out.print("new array :");
		for(int i=0;i<size;i++) {
			System.out.print(" "+arr[i]);
		}
		 
 	}

}
