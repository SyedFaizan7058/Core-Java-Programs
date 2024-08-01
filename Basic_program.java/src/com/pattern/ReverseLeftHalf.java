package com.pattern;

public class ReverseLeftHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		
		for(int r=n;r>=1;r--)
		{
			for(int k=1;k<=r;k++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++)
			{
				System.out.print("*");
			} 
			System.out.println();
		}

	}

}
