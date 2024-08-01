package com.pattern;

public class pattern {
	public static void main(String[] args) {
		int n=6;
		
		for(int r=1;r<=n;r++) {
			for(int c=1;c<=n;c++) {
				if(c>=7-r) {
					System.out.print(r+" ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
