package com.pattern;

public class Diamond_Star {
	public static void main(String[] args) {

		int n = 7;

		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (c >= 8 - r) {
					if (r % 2 != 0) {
						System.out.print("*" + " ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		for (int r = n; r >= 1; r--) {
			for (int c = 1; c <= n; c++) {
				if (c >= 9 - r) {
					if (r % 2 == 0) {
						System.out.print("*" + " ");
					}
				} else {
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}
}
