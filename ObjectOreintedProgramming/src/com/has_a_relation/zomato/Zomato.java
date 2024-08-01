package com.has_a_relation.zomato;

public class Zomato {

	public static void main(String[] args) {

		Order order = new Order(101, "Gingger Chicken", 120);

		Customer faizan = new Customer(1001, "faizan", "HYD", order);

		System.out.println(faizan);
	}

}
