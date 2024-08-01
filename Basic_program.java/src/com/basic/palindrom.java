package com.basic;

import java.util.Scanner;

public class palindrom {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter the number :");
    int num=sc.nextInt();
    int rev=0;
    for(int num1=num;num1>0;num1/=10){
      
      rev=rev*10+(num1%10);
      
    }
    System.out.print("Reverse Number is :"+rev+"\n");
    
    if(num==rev && num!=0){
        System.out.print("1 && it is a palindrom");
    } else if(num==0||num<0){
        System.out.print("The given number is zero!\nOR\n");
        System.out.print("-1 the given number is -ve kindly provide the +ve number only");
    }else if(num<100){
        System.out.print("-2  this program can check the operation for the 3 number only");
    }else{
        System.out.print(" 0 && The number is not a palindrom!");
    }
          
	  sc.close();       
}
}
