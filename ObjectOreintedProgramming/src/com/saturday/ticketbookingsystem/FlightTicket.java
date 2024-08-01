package com.saturday.ticketbookingsystem;

public class FlightTicket extends Ticket {

	private String flightNumber;

	public FlightTicket(String source, String destination, int price, String flightNumber) {
		super(source, destination, price);
		this.flightNumber = flightNumber;
	}

	@Override
	public void displayTicketDetails() {
		// TODO Auto-generated method stub
		super.displayTicketDetails();
		System.out.println("Flight Number :" + flightNumber);
	}

}
