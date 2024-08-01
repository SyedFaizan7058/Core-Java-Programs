package com.functionalInterface.consumer;

import java.util.function.Consumer;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CartItem c = new CartItem("Mobile", 12000, 1);
		ShoppingCart s = new ShoppingCart(c);

		Consumer<ShoppingCart> sc = x -> System.out.println(x);
		c.getTotalPrice();
		sc.accept(s);

	}

}
