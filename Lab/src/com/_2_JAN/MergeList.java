package com._2_JAN;

import java.util.ArrayList;
import java.util.Collections;

public class MergeList {

	public static ArrayList<String> mergeList() {

		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list1.add("Rohit");
		list1.add("Arjun");
		list1.add("Mayank");
		list2.add("Amia");
		list2.add("Ranjan");
		list2.add("Bala");
		Collections.sort(list1);
		Collections.sort(list2);
		list1.addAll(list2);
		return list1;

	}

	public static void main(String[] args) {

		System.out.println(mergeList());

	}

}
