package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class SwapPairElement {

	public static List<String> getlist(List<String> list) {

		int size = list.size();
		if (list.size() % 2 != 0)
			size--;

//		for (int i = 0; i < size; i += 2) {
//
//			String temp = list.get(i);
//			list.set(i, list.get(i + 1));
//			list.set(i + 1, temp);
//		}

		for (int i = 0; i < size; i += 2) {
			Collections.swap(list, i, i + 1);
		}
		return list;

	}
}

public class PairTester {

	public static void main(String[] args) {

		List<String> list = SwapPairElement.getlist(new ArrayList<String>(Arrays.asList("1", "2", "3", "4","5")));

		System.out.println(list);
	}

}
