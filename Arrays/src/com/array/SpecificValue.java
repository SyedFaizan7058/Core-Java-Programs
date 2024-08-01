package com.array;

import java.util.Scanner;

public class SpecificValue {

	public static void main(String[] args) {
		 
		int arr[]= {1789,2035,1899,1456,2013};
		int f1=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the specific value :");
		int sp=sc.nextInt();
		sc.close();
		
		int size=arr.length;
		
		for(int i=0;i<size;i++) {
			 
			if(arr[i]==sp) {
				f1=1;break;
			} 
			else f1=0;;
		}
		if(f1==1) {
		System.out.println("true");}else System.out.println("false");
		
		

	}

}
