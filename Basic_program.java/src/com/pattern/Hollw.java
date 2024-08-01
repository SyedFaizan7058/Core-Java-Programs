package com.pattern;

public class Hollw {
	public static void main(String[] args) {
		int n =7;
		

		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r == 1 || c == 1||r==n||c==n) {
					System.out.print(" *");
				} else {
					System.out.print("");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		String st = Rhombus.checkRhombus(6);
		System.out.println(st);
	}
}
