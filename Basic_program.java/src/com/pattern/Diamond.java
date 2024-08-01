package com.pattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of rows :");
		int num=sc.nextInt();
		
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<=num;c++)
			{
				if(c>=8-r)
				{
					if(r%2!=0)
					{	
					System.out.print("*"+" ");
					}
				}
				else
				{
					System.out.print(" ");
				}
			}	 
			System.out.print("\n");
		}
		for(int r=num;r>=1;r--)
        {
        	for(int c=1;c<num;c++)
        	{
        		 if(c>=8-r)
        		 {
        			 if(r%2==0)
        			 {
        				 System.out.print(" *");
        			 }
        		 }else
        		 {
        			 System.out.print(" ");
        		 }  
        		 
        	}
        	System.out.print("\n");
        	 
        }
		
		sc.close();
		
	}

}
