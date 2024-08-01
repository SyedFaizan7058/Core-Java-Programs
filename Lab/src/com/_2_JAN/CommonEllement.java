package com._2_JAN;

import java.util.ArrayList;
import java.util.List;

public class CommonEllement {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new ArrayList<String>();
		l1.add("Hii");
		l1.add("Geeks");
		l1.add("For");
		l1.add("Geeks");
		l2.add("Hii");
		l2.add("Geeks");
		l2.add("Gaurav");
		l1.retainAll(l2);
		System.out.println(l1);

	}

}
