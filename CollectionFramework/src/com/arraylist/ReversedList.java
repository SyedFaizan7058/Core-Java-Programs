package com.arraylist;

import java.util.Collections;
import java.util.List;

public class ReversedList {

	public static List<Integer> getList(List<Integer> list) {

		Collections.sort(list);

		System.out.println("Sorted List :" + list);

		Collections.reverse(list);

		return list;

	}

}
