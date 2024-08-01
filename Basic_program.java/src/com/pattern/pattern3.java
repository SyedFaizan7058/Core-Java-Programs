package com.pattern;

public class pattern3 {
	public static void main(String[] args) {
		int n=6;
		
		
		int a=1;
		for(int r=1;r<=n;r++,a=1) {
			for(int c=1;c<=n;c++) {
				if(c<=7-r) {
					System.out.print(a+" ");
					a++;
				}
			}
			System.out.println();
		}
	}

}
