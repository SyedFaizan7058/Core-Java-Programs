package com.saturday.ticketbookingsystem;

public class TrainTicket extends Ticket {

	private String trainNumber;

	public TrainTicket(String source, String destination, int price, String trainNumber) {
		super(source, destination, price);
		this.trainNumber = trainNumber;
	}

	public void displayTicketDetails() {

		super.displayTicketDetails();
		System.out.println("Train number :" + trainNumber);
	}

}
