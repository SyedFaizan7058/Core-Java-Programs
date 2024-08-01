package com.cmparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product(101, "Mobile", 10000.0));
		list.add(new Product(102, "Laptop", 20000.0));
		list.add(new Product(103, "Monitor", 9000.0));
		
		System.out.println("Sorting based on the product name...");
		Collections.sort(list);
		
		list.forEach(System.out::println);
		

	}

}
