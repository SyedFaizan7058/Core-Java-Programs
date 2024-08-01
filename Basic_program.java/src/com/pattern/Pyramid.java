package com.pattern;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numer :");
		int num=sc.nextInt();
		 
		 
		for(int r=1;r<=num;r++)
		{

			for(int j=1;j<=num;j++)
			{
				if(j>=5-r)
				{
				System.out.print(r+" ");
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
