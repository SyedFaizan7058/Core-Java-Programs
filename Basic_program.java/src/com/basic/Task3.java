package com.basic;

//import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
		
		double principle=Double.parseDouble(args[0]);
		double rate=Double.parseDouble(args[1]);
		double time=Double.parseDouble(args[2]);
		
//		System.out.println("Enter principle amount : ");
//		double principle=sc.nextDouble();
//		
//		System.out.println("Enter rate : ");
//		double rate=sc.nextDouble();
//		
//		System.out.println("Enter time : ");
//		double time=sc.nextDouble();
		
		double simpint=(principle*rate*time)/100;
		
		System.out.println("Simple Interest="+simpint);
		
		double amount=principle+simpint;
		
		System.out.println("Amount="+amount);
	 	
//		sc.close();
	}

}
