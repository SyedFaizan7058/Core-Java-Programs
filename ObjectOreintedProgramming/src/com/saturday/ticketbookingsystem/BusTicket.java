package com.saturday.ticketbookingsystem;

public class BusTicket extends Ticket {

	private String busCompany;

	public BusTicket(String source, String destination, int price, String busCompany) {
		super(source, destination, price);
		this.busCompany = busCompany;
	}

	@Override
	public void displayTicketDetails() {

		super.displayTicketDetails();
		System.out.println("Bus Company :" + busCompany);

	}

}
