package com.pattern;

public class Butterfly {
	public static void main(String[] args) {
		int n = 10;
		int r = 0;

		for (r = 1; r <= n; r++) {
			for (int c = 1; c <= r; c++) 
			{
				System.out.print("*");

			}
			for (int j = 1; j <= 2*(n-r); j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= r; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for (r = n; r >=1; r--) 
		{
			for (int c = 1; c <= r; c++) 
			{
				System.out.print("*");

			}
			for (int j = 1; j <= 2*(n-r); j++) 
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= r; k++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		 
	}

}
