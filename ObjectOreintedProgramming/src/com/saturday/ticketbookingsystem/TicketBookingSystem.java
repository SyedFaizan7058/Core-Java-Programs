package com.saturday.ticketbookingsystem;

public class TicketBookingSystem {

	public static void main(String[] args) {

		TrainTicket t = new TrainTicket("City A", "City B", 50, "123");
		t.displayTicketDetails();
		System.out.println("------------------------");
		BusTicket b = new BusTicket("City X", "City Y", 30, "XYZ Bus Company");
		b.displayTicketDetails();
		System.out.println("------------------------");
		FlightTicket f = new FlightTicket("City P", "City Q", 200, "ABC123");
		f.displayTicketDetails();

	}

}
