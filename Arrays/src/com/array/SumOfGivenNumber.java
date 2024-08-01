package com.array;

public class SumOfGivenNumber {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5,6};
		int tvalue=11;
		
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]+arr[j]==tvalue)
        		{
        			 System.out.println(arr[i]+"+"+arr[j]);
        			 System.out.println("Index :"+i);
        			 System.out.println("Index :"+j);
        			 
        		}
        	}
        }

	}

}
