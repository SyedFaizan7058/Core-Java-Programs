package com.ClassroomBookingSystem.Property;

public class House extends Property {

	private int numberOfBedrooms;
	private int numberOfBathrooms;

	public House(String address, double squareFootage, double price, int numberOfBedrooms, int numberOfBathrooms) {
		super(address, squareFootage, price);
		this.numberOfBedrooms = numberOfBedrooms;
		this.numberOfBathrooms = numberOfBathrooms;
	}
	
	public void displayInfo() {
		
		System.out.println("Address :"+getAddress());
		System.out.println("Square Footage :"+getSquareFootage());
		System.out.println("price :"+getPrice());
		System.out.println("Number of Bedrooms :"+numberOfBedrooms);
		System.out.println("Number of Bathrooms :"+numberOfBathrooms);
	}

}
