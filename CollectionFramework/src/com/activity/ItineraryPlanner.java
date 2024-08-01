package com.activity;

import java.util.ArrayList;
import java.util.List;

public class ItineraryPlanner {

	List<Destination> list = new ArrayList<>();
	

	public void addDestination(Destination d) {
		list.add(d);
	}

	public void getTravelData() {
		System.out.println(list);
	}

}
