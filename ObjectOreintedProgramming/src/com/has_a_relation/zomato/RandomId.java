package com.has_a_relation.zomato;

import java.util.Random;

public class RandomId {

	public static String[] getRandomId(int size, int range) {

		String[] str = new String[size];
		Random ran = new Random();
		for (int i = 0; i < str.length; i++) {
			str[i] = ran.toString();
		}
		return str;

	}
	
public static int[] getRandomNumber(int size, int range ) {
		
		int[] arr = new int[size];
		Random ran=new Random();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ran.nextInt(range);
		}
		return arr;
		
	}

}
