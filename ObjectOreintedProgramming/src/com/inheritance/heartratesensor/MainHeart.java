package com.inheritance.heartratesensor;

public class MainHeart {

	public static void main(String[] args) {

		HeartRateMonitor m = new HeartRateMonitor(60, 100);
		int heartRate = m.monitorHeartRate();
		m.checkHeartRate(heartRate);

	}

}
