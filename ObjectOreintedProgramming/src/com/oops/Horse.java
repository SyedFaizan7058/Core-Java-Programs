package com.oops;

public class Horse {
	private String horseName;
	private double horseHeight;
	private int horseAge;

	public Horse(String horseName, double horseHeight, int horseAge) {
		super();
		this.horseName = horseName;
		this.horseHeight = horseHeight;
		this.horseAge = horseAge;
		// this.m1();
	}

	public void setHorseName(String horseName) {
		this.horseName = horseName;
		// this.m1();
	}

	@Override
	public String toString() {
		return "Horse [horseName=" + horseName + ", horseHeight=" + horseHeight + ", horseAge=" + horseAge + "]";
	}

}