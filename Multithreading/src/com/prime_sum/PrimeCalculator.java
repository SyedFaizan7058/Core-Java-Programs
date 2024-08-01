package com.prime_sum;

public class PrimeCalculator extends Thread {

	private int lowerLimit;
	private int upperLimit;
	protected static int partialSum;

	public PrimeCalculator() {
	}

	public PrimeCalculator(int lowerLimit, int upperLimit) {
		super();
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

	@Override
	public void run() {

		synchronized (this) {

			for (int i = lowerLimit; i <= upperLimit; i++) {
				partialSum += checkPrime(i);
			}

		}

	}

	private static int checkPrime(int i) {
		int j = 2;
		for (; j <= i / 2; j++) {
			if (i % j == 0) {
				return 0;
			}
		}
		return i;
	}

	public int getPartialSum() {
		return partialSum;
	}

}
