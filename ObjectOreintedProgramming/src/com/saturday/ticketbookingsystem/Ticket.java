package com.saturday.ticketbookingsystem;

public class Ticket {

	private String source;
	private String destination;
	private int price;

	public Ticket(String source, String destination, int price) {
		super();
		this.source = source;
		this.destination = destination;
		this.price = price;
	}

	public void displayTicketDetails() {

		System.out.println("Source :" + source);
		System.out.println("Destintion :" + destination);
		System.out.println("Price :$" + price);

	}

}
