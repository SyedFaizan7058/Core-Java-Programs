package com.inheritance.heartratesensor;

public class HeartRateSensor {

	private int heartRate;

	public HeartRateSensor() {

	}

	public int getHeartRate() {
		return heartRate;
	}

	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	public int monitorHeartRate() {

		heartRate = (int) (Math.random() * 40) + 70;

		return heartRate;

	}

}
