package com.serialization;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Customer implements Serializable {

	private transient int customerId;
	private String customerName;
	private transient double customerBill;

	public Customer(int customerId, String customerName, double customerBill) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerBill="
				+ customerBill + "]";
	}

	public static Customer getCustomerObject() {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter customer id :");
		int id = sc.nextInt();

		System.out.print("Enter customer name :");
		String name = sc.nextLine();
		name = sc.nextLine();

		System.out.print("Enter customer bill :");
		double bill = sc.nextDouble();

		Customer customer = new Customer(id, name, bill);

		sc.close();

		return customer;

	}

}
