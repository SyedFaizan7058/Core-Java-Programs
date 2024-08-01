package com.pattern;

import java.util.Scanner;

public class Rhombus {
	
	public static String checkRhombus(int n) {
		
		String str="";
		
		for(int r=1;r<=n;r++)
		{
			for(int k=r;k<=n-1;k++)
			{
				 str=str+" ";
			}
			for(int c=1;c<=n;c++)
			{
				 str=str+"*";
			}
			 str=str+"\n";
		}
		
		return str;
	}

	public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.print("Enter no of rows :");
		 int num=sc.nextInt();
		 
		 String checkRhombus = Rhombus.checkRhombus(num);
		 
		 System.out.println(checkRhombus);
		 
		 sc.close();
		
	}

}
