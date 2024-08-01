package com.practice;

import java.util.List;

record Employee(int id, int salary) {
}

public class UppercaseConverter {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("abcd", "efgh", "jklm", "xyz");
//
//		List<String> l = list.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
//				.collect(Collectors.toList());
//
//		l.forEach(System.out::println);

		List<Employee> list = List.of(new Employee(101, 25000), new Employee(102, 32000));

		list.stream().sorted((o1, o2) -> -(o1.salary() - o2.salary())).forEach(System.out::println);

	}
}
