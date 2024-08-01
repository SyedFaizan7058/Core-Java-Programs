package com.prime_sum;

public class PrimeSumCalculator implements Runnable {

	private int totalSum;
	PrimeCalculator pc;

	public PrimeSumCalculator(PrimeCalculator pc) {
		this.pc = pc;
	}

	@Override
	public void run() {

		totalSum += pc.getPartialSum();

	}

	public int getTotalSum() {
		return totalSum;
	}

	public static void main(String[] args) throws InterruptedException {

		PrimeCalculator p1 = new PrimeCalculator(2, 10);
		PrimeCalculator p2 = new PrimeCalculator(21, 35);
		PrimeCalculator p3 = new PrimeCalculator(36, 50);
		p1.start();
		p2.start();
		p3.start();
		p1.join();
		p2.join();
		p3.join();

		PrimeSumCalculator ps = new PrimeSumCalculator(p1);
		Thread t = new Thread(ps);
		t.start();
		t.join();

		System.out.println("Total Sum of Prime Numbers :" + ps.getTotalSum());

	}

}
