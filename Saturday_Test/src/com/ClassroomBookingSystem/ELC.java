package com.ClassroomBookingSystem;

public class ELC {

	public static void main(String[] args) {
		
		Classroom c1=new Classroom("101");
		boolean reserved2 = c1.isReserved(false);
		System.out.println("Is classroom1 reserved?"+reserved2);
		c1.reserveRoom();
		c1.displayInfo();
		System.out.println("-------------------");
		LectureRoom l=new LectureRoom("201");
		boolean reserved = l.isReserved(true);
		System.out.println("Is classroom1 reserved?"+reserved);
		l.reserveRoom();
		l.displayInfo();
 
	}

}
