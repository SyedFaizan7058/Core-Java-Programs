package com._2_JAN;

import java.util.ArrayList;
import java.util.List;

public class Illustration {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);

		List<Integer> subList = list.subList(0, 3);
		List<Integer> subList2 = list.subList(3, 6);
		System.out.println(subList);
		System.out.println(subList2);

	}

}
