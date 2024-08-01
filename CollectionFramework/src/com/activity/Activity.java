package com.activity;

public class Activity {

	private String name;
	private String shedule;

	public Activity(String name, String shedule) {
		super();
		this.name = name;
		this.shedule = shedule;
	}

	public String getName() {
		return name;
	}

	public String getShedule() {
		return shedule;
	}

	@Override
	public String toString() {
		return "Activity name : " + name + ", shedule : " + shedule;
	}

}
