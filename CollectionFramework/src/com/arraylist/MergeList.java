package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class linkedList {

	public static LinkedList<String> getLinkedList(List<String> l1, List<String> l2) {

		Collections.sort(l1);
		Collections.sort(l2);
		l1.addAll(l2);

		return new LinkedList<String>(l1);

	}
}

public class MergeList {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<>(Arrays.asList("Rohit", "Arjun", "Mayank"));
		List<String> l2 = new ArrayList<>(Arrays.asList("Amiya", "Ranjan", "Bala"));
		LinkedList<String> l = linkedList.getLinkedList(l1, l2);
		System.out.println(l);

	}
}
