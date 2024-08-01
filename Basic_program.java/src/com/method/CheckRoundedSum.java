package com.method;

import java.util.Scanner;

public class CheckRoundedSum {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first number :");
		int num1=sc.nextInt();
		
		System.out.print("Enter the first number :");
		int num2=sc.nextInt();
		
		System.out.print("Enter the first number :");
		int num3=sc.nextInt();
		
		//int result=FindRoundedSum.getRoundedSum(num1, num2, num3);
		int roundedSum = FindRoundedSum.getRoundedSum(num1, num2, num3);
		System.out.println("Sum :"+roundedSum);
		
		sc.close();

	}

}
