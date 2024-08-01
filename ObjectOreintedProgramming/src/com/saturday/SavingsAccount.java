package com.saturday;

public class SavingsAccount extends BankAccount {

	private double interestRate;

	public SavingsAccount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}

	public void calculateInterest() {

		double interest = balance * interestRate / 100;
		balance = balance + interest;
		System.out.println("interest added :" + interest);

	}

}
