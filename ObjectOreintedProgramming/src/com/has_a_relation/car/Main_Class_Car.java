package com.has_a_relation.car;

public class Main_Class_Car {

	public static void main(String[] args) {
		
		Driver d1=new Driver("Fahad", 22);
		Driver d2=new Driver("Azeem", 21);
		Car c1=new Car("ODDI", "Q6", 2022, d1);
		System.out.println(c1);
		System.out.println("-------------------------------");
		Car c2=new Car(c1);
		System.out.println(c2);
		System.out.println("-------------------------------");
		c1.changeDriver(d2);
		System.out.println(c1);
		System.out.println("-------------------------------");
		System.out.println(c2);
 
	}

}
