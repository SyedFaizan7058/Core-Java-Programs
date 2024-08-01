package com.method;

import java.util.Scanner;

public class FindoddRounder {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number :");
		int num=sc.nextInt();
		
		int result=oddRounder.getRoundSum(num);
		
		System.out.println(result);
		
		sc.close();
	}

}
