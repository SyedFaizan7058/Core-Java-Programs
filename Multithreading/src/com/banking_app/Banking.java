package com.banking_app;

public class Banking {

	private double balance;
	private double withdrawAmount;

	public Banking(double balance, double withdrawAmount) {
		super();
		this.balance = balance;
		this.withdrawAmount = withdrawAmount;
	}

	public static void main(String[] args) {

		Banking banking = new Banking(5000, 2500);

		Runnable r = () -> {

			String name = null;

			synchronized (banking) {

				if (banking.balance >= banking.withdrawAmount) {
					name = Thread.currentThread().getName();
					System.out.println(banking.withdrawAmount + " Amount withdrawn by :" + name);
					banking.balance = banking.balance - banking.withdrawAmount;

				} else {

					name = Thread.currentThread().getName();
					System.out.println("Sorry " + name + " Balance is insufficiant");

				}
				System.out.println("Your Account balance is :" + banking.balance);
			}

		};

		Thread t1 = new Thread(r, "Faizan");
		Thread t2 = new Thread(r, "Taha");
		t1.start();
		t2.start();

	}

}
