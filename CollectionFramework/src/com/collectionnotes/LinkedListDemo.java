package com.collectionnotes;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {

		Integer arr[] = { 4, 3, 2, 1 };
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(3);

		for (int i = 0; i < list.size()-1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		System.out.println(list);
		list.sort(Collections.reverseOrder());
//		Collections.sort(list);

		ArrayList<Integer> a = new ArrayList<>();
		a.ensureCapacity(3);
		a.add(1);
		a.add(4);
		a.add(3);
		a.add(2);
		a.sort(Collections.reverseOrder());
//		Collections.sort(a);
		System.out.println(a);

	}

}
