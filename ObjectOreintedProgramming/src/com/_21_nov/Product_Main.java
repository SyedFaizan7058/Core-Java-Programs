package com._21_nov;

class Product {

	private String name;
	private double price;
	private double quantity;

	public Product(String name, double price, double quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public double getTotalCost() {
		return price * quantity;

	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}

class ShoppingCart {

	Product product;
	double totalCost;

	public void addProduct(Product[] products) {

		for (Product product : products) {
			System.out.println(product);
			totalCost += product.getTotalCost();
		}
	}

	public double getTotalCost() {
		return totalCost;

	}

	public void applyDiscount(double discount) {

		if (discount > 50) {
			System.out.println("Invalid discount percentage");
		} else {
			totalCost -= (totalCost * discount / 100);
			System.out.println("Total Cost after discount :" + totalCost);
		}

	}

}

public class Product_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product("Oil", 100, 2);
		Product p2 = new Product("Rice", 200, 1);
		Product p3 = new Product("Ice creame", 100, 1);
		Product p4 = new Product("haire Oil", 200, 1);

		Product[] product = { p1, p2, p3, p4 };

		ShoppingCart s = new ShoppingCart();
		s.addProduct(product);
		System.out.println("Total Cost :" + s.getTotalCost());
		s.applyDiscount(20);

	}

}
