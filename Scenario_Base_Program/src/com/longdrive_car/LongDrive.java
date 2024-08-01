package com.longdrive_car;

import java.util.ArrayList;
import java.util.List;

public class LongDrive {

	private List<Car> car;
	private List<Customer> customer;
	private List<Rental> rental;

	public LongDrive() {
		car = new ArrayList<>();
		customer = new ArrayList<>();
		rental = new ArrayList<>();
	};

	public void addCar(Car c) {
		car.add(c);
	}

	public void addCustomer(Customer c) {
		customer.add(c);
	}

	public void rentCar(Car c, Customer cus, int days) {

		if (c.isAvailable()) {
			c.setAvailable(false);
			rental.add(new Rental(c, cus, days));
			System.out.println("Car Rented Successfully...");
		} else {
			System.out.println("Car already rented...");
		}

	}

	public void returnCar(Rental r) {

		r.getCar().setAvailable(true);
		rental.remove(r);
		System.out.println("Car Return Successfully...");
	}
}
