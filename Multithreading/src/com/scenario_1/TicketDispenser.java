package com.scenario_1;

public class TicketDispenser implements Runnable {

	private final int allotedSeats = 10;
	private static int seatNumber = 0;

	@Override
	public void run() {
		int allotSeatNumber = allotSeatNumber();
		if (allotSeatNumber <= allotedSeats) {
			System.out.println(Thread.currentThread().getName() + " Your seat number is : " + allotSeatNumber);
		} else {
			System.err.println("Sorry " + Thread.currentThread().getName() + " All Seats are full!!");
		}
	}

	public int allotSeatNumber() {

		if (seatNumber > allotedSeats) {
			return -1;
		} else
			return ++seatNumber;

	}

}
