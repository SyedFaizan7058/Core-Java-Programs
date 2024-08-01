package com.saturday;

public class BankAccount {

	protected double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;

	}

	public void deposit(double amount) {

		System.out.println("Deposited :" + amount);
		balance = balance + amount;

	}

	public void withdraw(double amount) {

		if (balance >= amount) {

			System.out.println("Withdraw Amount :" + amount);
			balance -= amount;

		} else {

			System.out.println("Insufficient funds");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		
	}

}
