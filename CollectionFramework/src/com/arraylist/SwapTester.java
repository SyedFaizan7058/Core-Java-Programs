package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SwapElement {

	public static List<String> getList(List<String> list, String s1, String s2) {

		boolean c1 = list.contains(s1);
		boolean c2 = list.contains(s2);
		if (c1 && c2) {
			int i1 = list.indexOf(s1);
			int i2 = list.indexOf(s2);
			String temp = list.get(i1);
			list.set(i1, list.get(i2));
			list.set(i2, temp);

		} else
			System.out.println("Object not found...");
		return list;

	}
}

public class SwapTester {

	public static void main(String[] args) {

		List<String> list = SwapElement.getList(
				new ArrayList<String>(Arrays.asList("Surya", "Rohit", "Virat", "Rahul", "AB")), "Virat", "Rahul");
		System.out.println(list);

	}

}
