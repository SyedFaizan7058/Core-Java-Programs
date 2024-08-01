package com.inheritance.heartratesensor;

public class HeartRateMonitor extends HeartRateSensor {

	private int lowerLimit;
	private int upperLimit;

	public HeartRateMonitor(int lowerLimit, int upperLimit) {
		super();
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	public void checkHeartRate(int currentHeartRate) {

		if (currentHeartRate < lowerLimit || currentHeartRate > upperLimit) {

			System.out.println("Alert: Heart rate out of range! Current heart rate: " + currentHeartRate);
		} else {

			System.out.println("Heart rate within the normal range. Current heart rate: " + currentHeartRate);
		}

	}

}
