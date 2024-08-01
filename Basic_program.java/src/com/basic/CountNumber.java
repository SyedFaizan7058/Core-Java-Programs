package com.basic;

import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("Enter the number :");
		 int num=sc.nextInt();
		 int digits=1;
		 if(num>=10 && num<100) {
			 digits=2;
		 }else if(num>=100 && num<1000){
			 digits=3;
		 }else if(num>=1000 && num<10000) {
			 digits=4;
		 }else {
			 System.out.println("4 disgit ke aage meri haisiyat nahi hai!!");
		 }
		 System.out.println("Number of digit :"+digits);
         sc.close();
	}

}
