package com.ClassroomBookingSystem.Property;

public class Property {

	private String address;
	private double squareFootage;
	private double price;

	public Property(String address, double squareFootage, double price) {
		super();
		this.address = address;
		this.squareFootage = squareFootage;
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public double getSquareFootage() {
		return squareFootage;
	}

	public double getPrice() {
		return price;
	}
	
	public void displayInfo() {
		
		System.out.println("Address :"+address);
		System.out.println("Square Footage :"+squareFootage);
		System.out.println("Price: $"+price);
	}

}
