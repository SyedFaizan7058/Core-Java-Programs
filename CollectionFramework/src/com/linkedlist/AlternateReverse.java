package com.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AlternateReverse {

	public static List<Integer> getList(List<Integer> list, int k) {

		int i = 0;
		while (i < list.size()) {
			int start = i;
			int end = i + k - 1;
			end = (end >= list.size()) ? list.size() - 1 : end;

			List<Integer> l = list.subList(start, end + 1);
			Collections.reverse(l);

			i += k + k;
		}
 
		return list;

	}

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
		System.out.println(getList(list, 4));
//		Output 
//		System.out.println("3, 2, 1, 4, 5, 6, 9, 8, 7");

	}

}
