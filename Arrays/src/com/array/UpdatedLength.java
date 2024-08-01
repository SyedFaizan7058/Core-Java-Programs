package com.array;

public class UpdatedLength {

	public static void main(String[] args) {
		
		int arr[]= {20,20,30,40,50,50,50};
		int size=arr.length;
		System.out.println("Orignal Array length :"+size);
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
		
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+arr[i]);
		}
		System.out.println("\nlength after deleting duplicate element :"+size);
 
	}

}
