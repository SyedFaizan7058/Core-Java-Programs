package com.scenario_1;

public class OnlineReservationSystem {
	public static void main(String[] args) {

//      This code for lambda
//		TicketDispenser t = new TicketDispenser();
//		Thread t1 = new Thread(() -> distributeSeats(t), "Faizan");
//		Thread t2 = new Thread(() -> distributeSeats(t), "Taha");
//		t1.start();
//		t2.start();

		Thread thread = new Thread(new TicketDispenser(), "Faizan");
		Thread thread1 = new Thread(new TicketDispenser(), "Taha");
		Thread thread2 = new Thread(new TicketDispenser(), "Adnan");
		Thread thread3 = new Thread(new TicketDispenser(), "Musharraf");
		Thread thread4 = new Thread(new TicketDispenser(), "Azim");
		Thread thread5 = new Thread(new TicketDispenser(), "Fahad");
		Thread thread6 = new Thread(new TicketDispenser(), "Affan");
		Thread thread7 = new Thread(new TicketDispenser(), "Azher");
		Thread thread8 = new Thread(new TicketDispenser(), "Zuhaib");
		Thread thread9 = new Thread(new TicketDispenser(), "Umair");
		Thread thread10 = new Thread(new TicketDispenser(), "Aman");
		thread.start();
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();

	}

	public static void distributeSeats(TicketDispenser dispenser) {

		for (int i = 0; i < 50; i++) {
			System.out
					.println("Thread Name :" + Thread.currentThread().getName() + " : " + dispenser.allotSeatNumber());
		}
	}
}
