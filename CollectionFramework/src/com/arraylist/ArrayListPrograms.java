package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListPrograms {

	public static void main(String[] args) {

		printCollection("Red");
		System.out.println("------------------");
		printUsing7Ways();
		System.out.println("------------------");
		copyList();
		System.out.println("------------------");
		swapElement();
		System.out.println("------------------");
		descendingOrder();
	}

	private static void descendingOrder() {

		List<String> list = new ArrayList<>();
		list.add("Blue");
		list.add("Red");
		list.add("Pink");

		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Descending Order :" + list);

	}

	private static void swapElement() {

		List<Integer> list = Arrays.asList(6, 5, 4, 3, 2, 1);
		List<Integer> l = new ArrayList<>();

		Object[] array = list.toArray();

		Collections.sort(list);
		System.out.println("Ascending order :" + list);
		System.out.println("List to Array :" + Arrays.toString(array));

		int temp = list.get(0);
		list.set(0, list.get(1));
		list.set(1, temp);

		l.addAll(list);
		System.out.println("List :" + list);
		System.out.println("isEmpty :" + l.isEmpty());

	}

	private static void copyList() {

		List<String> list = new ArrayList<>();
		list.add("Blue");
		list.add("Red");
		list.add("Pink");

		List<String> l = new ArrayList<>(Arrays.asList("Green"));
		l.forEach(System.out::println);
		list.addAll(l);
		System.out.println("Join Two List :" + list);

		Collections.shuffle(l);
		System.out.println("Shuffle Element :" + l);
		Collections.reverse(list);
		System.out.println("Reverse Element :" + list);

		boolean containsAll = list.containsAll(l);
		System.out.println("Compare Two Lists :" + containsAll);

	}

	private static void printUsing7Ways() {

		List<String> list = new ArrayList<>();
		list.add("Blue");
		list.add("Red");
		list.add("Pink");

		System.out.println("Using Ordenary for loop :");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("Using Inhanced for loop :");
		for (String i : list) {
			System.out.println(i);
		}
		System.out.println("Using while loop :");
		int i = 0;
		while (true) {
			System.out.println(list.get(i));
			i++;
			if (i == list.size())
				break;
		}

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("Using ListIterator :");
		ListIterator<String> ltr = list.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
		}

		System.out.println("Using ForEach Method/Reference:");
		list.forEach(System.out::println);
	}

	private static void printCollection(String str) {

		List<String> list = Arrays.asList("Blue", "Red", "Pink");
		list.forEach(System.out::println);
		System.out.println("element present :" + list.contains(str));

	}

}
