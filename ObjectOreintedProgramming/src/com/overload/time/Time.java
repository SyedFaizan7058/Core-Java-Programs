package com.overload.time;

import java.text.DecimalFormat;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;

	public Time() {

	}

	public Time(int hours) {

		this.hours = hours;

	}

	public Time(int hours, int minutes) {

		this.hours = hours;
		this.minutes = minutes;
	}

	public Time(int hours, int minutes, int seconds) {

		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("00");
		return "Time : " + df.format(hours) + ":" + df.format(minutes) + ":" + df.format(seconds);
	}

}
