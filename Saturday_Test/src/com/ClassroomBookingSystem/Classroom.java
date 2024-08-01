package com.ClassroomBookingSystem;

public class Classroom extends ClassroomBookingSystem {

	public Classroom(String roomNumber) {
		super(roomNumber);
	}

	public void displayInfo() {

		System.out.println("Class Room Number :"+getRoomNumber());

	}

}
