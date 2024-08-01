package com.array;

import java.util.Scanner;

public class RemoveSpecificElement {

	public static void main(String[] args) {
		
		int arr[]= {25,14,56,15,36};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number to be remove :");
        int rem=sc.nextInt();
        sc.close();
        
        int size=arr.length;
        
        for(int i=0;i<size;i++) {
        	if(arr[i]==rem) { 
        		for(int j=i;j<size-1;j++) {
               	 arr[j]=arr[j+1];
         	}
        	size--; i--;
        	}
        	
        }
        
        for(int i=0;i<size;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
        //Another way to print
        
//        int[] r = new int[size];
//        System.arraycopy(arr, 0, r, 0, size);
        
//        arr = null;
//        for(int i:r) {
//        	System.out.print(i+" ");
//        }
 	}

}
