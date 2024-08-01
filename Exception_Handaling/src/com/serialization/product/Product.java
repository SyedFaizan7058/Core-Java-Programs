package com.serialization.product;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Product implements Serializable {

	private int productId;
	private String productName;
	private int productQuantity;

	public Product(int productId, String productName, int productQuantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQuantity="
				+ productQuantity + "]";
	}

	public static Product getProductObject() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter product id :");
		int id = sc.nextInt();

		System.out.print("Enter product name :");
		String name = sc.nextLine();
		name = sc.nextLine();

		System.out.print("Enter product quantity :");
		int quantity = sc.nextInt();

		Product product = new Product(id, name, quantity);

		sc.close();

		return product;

	}

}
