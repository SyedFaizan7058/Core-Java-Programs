package com.pattern;

import java.util.Scanner;

public class FloydsTriangle {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of rows :");
		int num=sc.nextInt();
		int a=1;
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(a+" ");
				a++;
			}
			System.out.print("\n");
		}
		
		sc.close();
	}

}
