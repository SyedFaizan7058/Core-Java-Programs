package com.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicates {

	public static List<Integer> getList(List<Integer> list) {

		for (int i = 0; i < list.size(); i++) {
			for(int j=i+1;j<list.size();j++)
			if (list.get(i) == list.get(j)) {
				list.remove(j);
				j--;
			}
		}

		return list;

	}

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>(Arrays.asList(12, 11, 12,21, 41, 43, 21));

		System.out.println(getList(list));

	}

}
