package com.functionalInterface.consumer;

public class CartItem {

	private String name;
	private double price;
	private int quantity;

	public CartItem(String name, double price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double getTotalPrice() {

		if (price > 10000) {
			return price = price - price * 0.10;
		}
		return price;

	}

	@Override
	public String toString() {
		return "CartItem [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
