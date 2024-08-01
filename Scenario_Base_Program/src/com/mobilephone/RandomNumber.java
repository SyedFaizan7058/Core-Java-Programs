package com.mobilephone;

import java.util.Random;

public class RandomNumber {

	public static int[] getRandomNumber(int size, int range) {

		int[] arr = new int[size];
		Random ran = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(range);
		}
		return arr;

	}

}
