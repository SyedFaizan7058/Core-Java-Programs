package com.pattern;

import java.util.Scanner;

public class PascalsTriangle {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of rows :");
		int num=sc.nextInt();
		
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num;c++)
			{
				if(c>=6-r)
				{
					System.out.print(1+" ");
					 
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
        sc.close();
	}

}
