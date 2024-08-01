package com.customer;

public class Customer {

	private String customerName;
	private int creditPoints;

	public Customer(String customerName, int creditPoints) {
		super();
		this.customerName = customerName;
		this.creditPoints = creditPoints;
	}

//	public int getCreditPoints() {
//		return creditPoints;
//	}

	@Override
	public String toString() {
		return "" + customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCreditPoints() {
		return creditPoints;
	}

	public void setCreditPoints(int creditPoints) {
		this.creditPoints = creditPoints;
	}

}
