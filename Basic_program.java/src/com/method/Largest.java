package com.method;

import java.util.*;

class Largest1 {
	public static int getGretest(int num1,int num2){

        if (num1>num2){
            return num1;
        }
            return num2;
        
    }
}
public class Largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first number :");
        int num1=sc.nextInt();

        System.out.print("Enter the second number :");
        int num2=sc.nextInt();

        int result=Largest1.getGretest(num1,num2);

        System.out.println("The largest number is :"+result);

        sc.close();
    }
}


