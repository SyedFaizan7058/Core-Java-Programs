package com.basic;

//import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		 
//		Scanner sc=new Scanner(System.in);
		
		double netbill=Double.parseDouble(args[0]);
//		
//		System.out.println("Enter Net Bill : ");
//		double netbill=sc.nextDouble();
		
		double dis=0;
		
		System.out.println("Your Net Bill="+netbill);
		
		if(netbill<5000) {
			System.out.println("You have a discount of '5%'!");
			dis=0.05;
		}
		else if(netbill>=5000 && netbill<10000) {
			System.out.println("You have a discount of '10%!'");
			dis=0.10;
		}
		else if(netbill>=10000) {
			System.out.println("You have a discount of '15%'");
			dis=0.15;
		}
		
		double amount=netbill-netbill*dis;
		double disamount=netbill-amount;
		System.out.println("discount amount="+disamount);
		System.out.println("amount payable="+amount);
		 
//		sc.close();
		
		
	}

}
