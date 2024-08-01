package com.pattern;

public class Square_Fill {
	public static void main(String[] args) {
		int n=7;
		
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=n;c++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
