package com.basic;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
		
		 //int day=Integer.parseInt(args[0]);
		
	     System.out.println("Enter days : ");
	     int day=sc.nextInt();
	       
	     int year=day/365;
	     int remeaningday=day%365;
	     int month=remeaningday/30;
	     remeaningday%=30;
	     
	     System.out.println("Days="+day);
	     System.out.println("year="+year);
	     System.out.println("month="+month);
	     System.out.println("remeaningday="+remeaningday);
				
	     sc.close();
	}

}
