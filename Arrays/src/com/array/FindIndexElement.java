package com.array;

import java.util.Scanner;

public class FindIndexElement {

	public static void main(String[] args) {
		
		int arr[]= {25,14,56,15,36};
		int x=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number to find index number :");
		int fi=sc.nextInt();
		sc.close();
		
		int size=arr.length;
		
		for(int i=0;i<size;i++) {
			
			if(arr[i]==fi) {
				x=i;
			}
		}
		
		System.out.println("Index position of "+fi+" is :"+x);
		
	}

}
