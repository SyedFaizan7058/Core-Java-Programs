package com.ClassroomBookingSystem;

public class LectureRoom extends ClassroomBookingSystem{

	public LectureRoom(String roomNumber) {
		super(roomNumber);
 	}
	
	public void displayInfo() {
		
		System.out.println("Lecture Room Number :"+getRoomNumber());
	}

}
