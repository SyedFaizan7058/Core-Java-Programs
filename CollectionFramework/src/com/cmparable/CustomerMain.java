package com.cmparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {

		List<Customer> list = new ArrayList<>();
		list.add(new Customer(103, "Taha", 1150.50));
		list.add(new Customer(101, "Sohail", 1250.50));
		list.add(new Customer(102, "Zeeshan", 1050.50));

		Comparator<Customer> c1 = (p1, p2) -> p1.getCustomerNumber() - p2.getCustomerNumber();
		System.out.println("Sorting based on the customer number!!!");
		Collections.sort(list, c1);
		list.forEach(System.out::println);
		System.out.println("------------------------------------------------------------------------------------");
		Comparator<Customer> c2 = (p1, p2) -> p1.getCustomerName().compareTo(p2.getCustomerName());
		System.out.println("Sorting based on the customer name!!!");
		Collections.sort(list, c2);
		list.forEach(System.out::println);
		System.out.println("------------------------------------------------------------------------------------");
		
		Comparator<Customer> c3 = (p1, p2) -> p1.getCustomerBill().compareTo(p2.getCustomerBill());
		Collections.sort(list, c3);
		System.out.println("Sorting based on the customer bill!!!");
		list.forEach(System.out::println);
		
	}

}
