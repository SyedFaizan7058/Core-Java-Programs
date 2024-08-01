package com.saturday;

public class MainBank {

	public static void main(String[] args) {

		SavingsAccount a = new SavingsAccount(1000, 1.0);
		CheckingAccoun e = new CheckingAccoun(1000);
		System.out.println("Preevious Balance :$" + a.getBalance());
		a.deposit(200);
		a.calculateInterest();
		System.out.println("Savings Account Balance: $" + a.getBalance());
		System.out.println("-------------------------");
		e.deposit(300);
		e.withdraw(100);
		System.out.println("Checking Account Balance :" + e.getBalance());
	}

}
