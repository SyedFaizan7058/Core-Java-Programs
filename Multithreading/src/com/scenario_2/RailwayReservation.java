package com.scenario_2;

public class RailwayReservation {
	private static int availableSeat = 1;
	private static int wanted=1;

	public static void main(String[] args) {

		Runnable r =() -> {

			String name = null;
			synchronized (args) {
				
			if (availableSeat >= wanted && wanted!=0) {
				name = Thread.currentThread().getName();
				System.out.println(wanted + " seat is reserved for :" + name);
				System.out.println("Congratulations " + name + " Your ticket is Booked");
				availableSeat = availableSeat - wanted;
			} else {
				name = Thread.currentThread().getName();
				System.err.println("Sorry " + name + " berth is not available!!");
			}}

		};

		Thread t1= new Thread(r,"Virat");
		Thread t2 = new Thread(r,"Rohit");
		t1.start();
		t2.start();

	}

}
