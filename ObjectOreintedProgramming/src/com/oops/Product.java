package com.oops;

import java.util.*;

public class Product {
	int productId;
	String productName;
	double productPrice;

	private void initializeProperties(int id, String name, double price) {

		productId = id;
		productName = name;
		productPrice = price;
	}

	public void switchOn() {
		System.out
				.println("The product is now on his peak level\nThe fan is having so many configurations\nProduct ID :"
						+ productId + "\nproduct name:" + productName + "\nPrice of the product :" + productPrice
						+ "\n");
	}

	public void switchOff() {
		System.out.println("The product is now on his downfull\nproduct having so many specifications\nProduct ID :"
				+ productId + "\nproduct name:" + productName + "\nPrice of the product :" + productPrice + "\n");
	}

	public static void main(String[] args) {

		Product p = new Product();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter id :");
		int id = sc.nextInt();
		System.out.print("Enter name :");
		String name = sc.nextLine();
		name = sc.nextLine();
		System.out.print("Enter price :");
		double price = sc.nextDouble();
		System.out.println("-------------------------------------------\n");
		p.initializeProperties(id, name, price);
		p.switchOn();
		System.out.println("-------------------------------------------\n");
		p.switchOff();

		sc.close();

	}

}
