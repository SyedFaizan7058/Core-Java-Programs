package com.basic;

import java.util.Scanner;

public class Asscii {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the character : ");
		char ch=sc.next().charAt(0);
		
		int num=ch;
		
		System.out.println("The asscii value of "+ch+" is "+num);
		 
		sc.close();
		
	}

}
