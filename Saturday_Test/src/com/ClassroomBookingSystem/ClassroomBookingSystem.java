package com.ClassroomBookingSystem;

public class ClassroomBookingSystem {

	private String roomNumber;
	private boolean isReserved;

	public ClassroomBookingSystem(String roomNumber) {
		super();
		this.roomNumber = roomNumber;
	}

	public void reserveRoom() {

 		if (isReserved == isReserved(isReserved)) {

			System.out.println("Room" + roomNumber + "  has been reserved.");

		}
	}

	public boolean isReserved(boolean b) {
		return b;

	}

	public String getRoomNumber() {
		return roomNumber;
	}

	 
}
