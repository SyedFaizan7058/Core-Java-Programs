package com.pattern;

import java.util.Scanner;

public class DivisibleBy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number from 1-100 : ");
		int num=sc.nextInt();
		int i;
		sc.close();
		System.out.println("divided by 3 :");
		for(i=1;i<num;i++) {
			if(i%3==0) {
				
				System.out.print(i+" ");
			} 
		}
		
		System.out.println("\n");
		System.out.println("divided by 5 :");
		for(i=1;i<num;i++) {
			if(i%5==0) {
				
				System.out.print(i+" ");
			}
		}
			
		System.out.println("\n\nDivided by 3 & 5: ");			
		for (i=1; i<num; i++) {
			if (i%3==0 && i%5==0) {
				
				System.out.print(i +" ");			
			}
		}
		
		System.out.println("\n");
	
 	}

}
