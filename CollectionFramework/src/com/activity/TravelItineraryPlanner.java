package com.activity;

public class TravelItineraryPlanner {

	public static void main(String[] args) {
		
		ItineraryPlanner i = new ItineraryPlanner();
		Destination d1 = new Destination("Hyderabad");
		Activity a1= new Activity("Lovers-park", "Morning");
		Activity a2 = new Activity("Char-Minar", "Nigth");
		d1.addActivity(a1);
		d1.addActivity(a2);
		i.addDestination(d1);
		System.out.println("--------------------------------------------------------");
		Destination d2 = new Destination("Mumbai");
		Activity a3= new Activity("Lonavla", "Morning");
		Activity a4 = new Activity("Juhu Beach", "Nigth");
		d2.addActivity(a3);
		d2.addActivity(a4);
		i.addDestination(d2);
		i.getTravelData();
		
		
		
		
		

	}

}
