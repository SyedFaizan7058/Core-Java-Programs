package com.basic;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
 		System.out.println("Enter the password : ");
 		int pass=sc.nextInt();
 		
 		System.out.println("Your password is : "+pass);
 		
 		sc.close();
  	}

}
