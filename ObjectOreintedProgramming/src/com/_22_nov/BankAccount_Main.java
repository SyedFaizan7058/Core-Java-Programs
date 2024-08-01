package com._22_nov;

class BankAccount {

	protected double balance;
	protected long accountNumber;

	public BankAccount(double balance, long accountNumber) {
		super();
		this.balance = balance;
		this.accountNumber = accountNumber;
	}

	public void deposit(double amount) {

		balance += amount;
	}

	public void withdraw(double amount) {

		balance -= amount;
	}
}

class SavingsAccount extends BankAccount {

	private double minimumBalance;

	public SavingsAccount(double balance, long accountNumber, double minimumBalance) {
		super(balance, accountNumber);
		this.minimumBalance = minimumBalance;
	}

	@Override
	public void deposit(double amount) {

		if (amount > 0) {

			super.balance += amount;

			System.out.println("Your balance after " + amount + " deposite " + super.balance);

		} else {

			System.out.println("Invalid amount!!");
		}

	}

	@Override
	public void withdraw(double amount) {

		if ((balance - amount) >= this.minimumBalance) {

			super.balance -= amount;

			System.out.println("Your balance after " + amount + " withdraw " + super.balance);

		} else {

			System.out.println("Insufficient fund!!");
		}
	}

}

class CheckingAccount extends BankAccount {

	protected double overdraftLimit;

	public CheckingAccount(double balance, long accountNumber, double overdraftLimit) {
		super(balance, accountNumber);
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void withdraw(double amount) {

		if (amount < (super.balance + this.overdraftLimit)) {

			balance -= amount;
			System.out.println("Your balance after " + amount + " withdraw " + super.balance);

		} else {

			System.out.println("Some Error Occured!!");
		}
	}

}

public class BankAccount_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount sb = new SavingsAccount(1000, 7058653637L, 500);
		System.out.println("Your initial balance :" + sb.balance);
		sb.deposit(1000);
		sb.withdraw(1500);
		System.out.println("----------------------------------");

		CheckingAccount ca = new CheckingAccount(1000, 7058653637L, 500);
		ca.withdraw(500);

	}

}
