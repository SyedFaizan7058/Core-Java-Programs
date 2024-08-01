package com.ClassroomBookingSystem.Property;

public class PropertyDemo {

	public static void main(String[] args) {
		
		Property p=new Property("123 Main st", 1500, 20000);
		p.displayInfo();
		System.out.println("--------------------");
		House h=new House("456 Oak Ave", 2000, 300000, 3, 2);
		h.displayInfo();
 
	}

}
