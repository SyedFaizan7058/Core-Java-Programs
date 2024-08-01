package com.recurssion;

import java.util.*;

class natural {

	public static String getNaturalNumbers(int start, int end) {

		String str = "";

		if (start < 0 || end < 0) {
			return "-1";
		} else if (start == 0 || end == 0) {
			return "-2";
		} else {
			if (start == end)
				str += start;
			else
				str += start + " " + getNaturalNumbers(start + 1, end);
		}

		return str;
	}
}

public class GetNaturalNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the starting range :");
		int start = sc.nextInt();
		System.out.print("Enter the Ending number :");
		int end = sc.nextInt();
		sc.close();

		String result = natural.getNaturalNumbers(start, end);

		System.out.print(result);

	}
}