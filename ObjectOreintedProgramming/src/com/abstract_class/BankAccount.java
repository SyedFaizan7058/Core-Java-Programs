package com.abstract_class;

abstract class BankAccount {

	private String accountName;
	private static double balance;

	public BankAccount() {

	}

	public BankAccount(String accountName, double balance) {
		this.accountName = accountName;
		BankAccount.balance = balance;
	}

	public void display() {
		System.out
				.println("$" + balance + " is deposited into the savings account, so the balance becomes $" + balance);
	}

	public abstract void deposit(double amount);

	public abstract void withdraw(double amount);

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		BankAccount.balance = balance;
	}

	public abstract void displayAccountBalances();

}

class SavingAccount extends BankAccount {

	public SavingAccount(String accountName, double balance) {
		super(accountName, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposit(double amount) {

		if (amount <= 0) {
			System.out.println("Amount is 0 or negative Cannot deposite!");
		} else {
			setBalance(getBalance() + amount);
			System.out.println(
					"$" + amount + "is deposited into the savings account, so the balance becomes $ " + getBalance());
		}
	}

	@Override
	public void withdraw(double amount) {

		if (getBalance() >= amount) {
			setBalance(getBalance() - amount);
			System.out.println(
					"$" + amount + "is withdrawn from the savings account, so the balance becomes $" + getBalance());
		} else {
			System.out.println("insufficient balance Amount cannot be withdraw");
		}
	}

	@Override
	public void displayAccountBalances() {
		System.out.println("Balance: $" + getBalance());
	}

}

class CheckingAccount extends BankAccount {
	@Override
	public void deposit(double amount) {

		if (amount <= 0) {
			System.out.println("Amount is 0 or negative Cannot deposite!");
		} else {
			setBalance(getBalance() + amount);
			System.out.println(
					"$" + amount + "is deposited into the checking account, so the balance becomes $ " + getBalance());
		}
	}

	@Override
	public void withdraw(double amount) {

		if (getBalance() >= amount) {
			setBalance(getBalance() - amount);
			System.out.println(
					"$" + amount + "is withdrawn from the checking account, so the balance becomes $" + getBalance());
		} else {
			System.out.println("insufficient balance Amount cannot be withdraw");
		}
	}

	@Override
	public void displayAccountBalances() {
		System.out.println("Balance: $" + getBalance());
	}
}
