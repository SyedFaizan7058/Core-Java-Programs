package com.collectionnotes;

import java.util.Arrays;
import java.util.List;

public class ArrayTOList {

	public static List<String> convertToList(String[] str) {

		List<String> list = Arrays.asList(str);

		return list;

	}

	public static void main(String[] args) {

		String[] str = { "My", "Name", "is", "Faizan" };
		System.out.println(convertToList(str));
	}

}
