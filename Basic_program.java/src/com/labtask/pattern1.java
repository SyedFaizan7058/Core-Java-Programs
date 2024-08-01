package com.labtask;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int num=sc.nextInt();
		
		String result=Findpatter1.getPattern(num);
		
		System.out.println(result);
		
		sc.close();
		
		 
	}

}
