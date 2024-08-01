package com.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _29_Jan {

	public static void main(String[] args) {

		flatMapList();

	}

	public static void distinct() {

		Integer arr[] = { 1, 2, 3 };
		boolean b = Arrays.stream(arr).distinct().count() < arr.length;
		System.out.println(b);

	}

	public static void flatMapList() {

		List<String> l1 = Arrays.asList("Faizan", "Taha");
		List<String> l2 = Arrays.asList("Fahad", "Azim");
		List<String> l3 = Arrays.asList("Affan", "Zuhaib");

		List<List<String>> list = Arrays.asList(l1, l2, l3);
		list.stream().flatMap(l -> l.stream()).forEach(System.out::println);

	}

	public static void cubeOfNumber() {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> collect = list.stream().map(l -> l * l * l).filter(ll -> ll > 50).collect(Collectors.toList());

		System.out.println(collect);

	}

}
