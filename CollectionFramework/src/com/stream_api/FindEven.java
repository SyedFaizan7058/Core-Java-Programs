package com.stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindEven {

	public static void findEven() {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
		list.stream().filter(l -> l % 2 == 0).forEach(System.out::println);

	}

	public static void startingLetter() {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		myList.stream().filter(l -> l.toString().startsWith("1")).forEach(System.out::println);

	}

	public static void findDuplicate() {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

//		Set<Integer> s = new HashSet<>();

//		List<Integer> collect = myList.stream().filter(l -> !s.add(l)).collect(Collectors.toList());

		myList.stream().filter(i -> Collections.frequency(myList, i) > 1).collect(Collectors.toSet())
				.forEach(System.out::println);

//		System.out.println("Duplicate Elements are :" + collect);

	}

	public static void findMax() {

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		Optional<Integer> max = myList.stream().max((o1, o2) -> o1.compareTo(o2));
		max.ifPresent(l -> System.out.println("Max Element :" + l));

	}

	public static void lastChar() {

		List<String> list = Arrays.asList("Shankar", "Ravi", "Ankit", "Tendulkar");

		list.stream().filter(l -> l.endsWith("r")).forEach(System.out::println);
	}

	public static void main(String[] args) {

		findDuplicate();

	}

}
