package com.pattern;

public class ZeroOneTrangle {
	public static void main(String[] args) {
		
		int n=6;
		
		for(int r=1;r<=n;r++)
		{
			for(int c=1;c<=r;c++)
			{
				int sum=r+c;
				if(sum%2==0) {
					System.out.print(1);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
