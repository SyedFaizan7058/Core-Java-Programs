package com.longdrive_car;

public class Car {

	private String registrationNumber;
	private String model;
	private boolean available = true;

	public Car(String registrationNumber, String model) {
		super();
		this.registrationNumber = registrationNumber;
		this.model = model;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getModel() {
		return model;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
