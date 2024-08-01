package com._20_nov;

class BankAccount {

	protected double balance;
	private double interestRate;

	{
		interestRate = 0.01;
	}

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void deposite(int amount) {

		balance += amount;
	}

	public void withdraw(int amount) {

		balance -= amount;
		System.out.println(amount + " Rs withdraw from your account :" + balance);

	}

}

class SavingsAccount extends BankAccount {

	private double minimumBalance;

	{
		setInterestRate(0.02);
	}

	public SavingsAccount(double balance, double minimumBalance) {
		super(balance);
		this.minimumBalance = minimumBalance;
	}

	public void deposite(int amount) {

		if (amount > 0) {
			super.balance = balance + amount;
			System.out.println(amount + " Rs deposited in your account :" + super.balance);
		} else {

			System.out.println("provide positive number!!");
		}

	}

	public void withdraw(int amount) {

		if (balance - amount < minimumBalance) {

			System.out.println("Insufficient Fund!!");

		} else {

			super.withdraw(amount);

		}

	}

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

}

public class BankAccount_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount s = new SavingsAccount(0, 500);
		System.out.println("Available balance :" + s.getBalance());
		s.deposite(1000);
		s.withdraw(500);
		s.withdraw(600);
//		s.withdraw(400);
//		s.withdraw(10);

	}

}
