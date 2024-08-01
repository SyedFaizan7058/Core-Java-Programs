package com.pattern;

public class LeftHalfPyramid {

	public static void main(String[] args) {
		 
		int n=6;
		
		for(int r=n;r>=1;r--)
		{
			for(int k=1;k<r;k++)
			{
				System.out.print(" ");
			}
			for(int c=0;c<=n-r;c++)
			{
				 
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=7-i)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
