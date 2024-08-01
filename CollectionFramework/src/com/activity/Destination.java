package com.activity;

import java.util.ArrayList;
import java.util.List;

public class Destination {

	private String name;
	List<Activity> list = new ArrayList<>();

	public Destination(String name) {
		this.name = name;
	}

	public void addActivity(Activity a) {
		list.add(a);
	}

	@Override
	public String toString() {
		return "Destination name : " + name + "\n" + list+"\n";
	}

}
