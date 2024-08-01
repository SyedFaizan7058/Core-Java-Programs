package com.array.sorting;

import java.util.Random;

public class RandomId {

	public static String[] getRandomId(int size, long range) {

		String[] str = new String[size];
		Random ran = new Random();
		for (int i = 0; i < str.length; i++) {
			str[i] = ran.toString();
		}
		return str;

	}

	public static void main(String[] args) {

		String str[] = RandomId.getRandomId(5, 255);
		System.out.println(str);
	}

}
