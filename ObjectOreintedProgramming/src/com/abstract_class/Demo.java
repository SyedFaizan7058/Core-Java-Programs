package com.abstract_class;

public class Demo {

	public static void main(String[] args) {

		BankAccount a1, a2;
		a1 = new SavingAccount("azeem", 1000.0);
		a1.display();
		a2 = new CheckingAccount();
		a2.deposit(500);
		a1.withdraw(200);
		a1.displayAccountBalances();
		a2.withdraw(100);
		a2.displayAccountBalances();
		String name = a1.getAccountName();
		System.out.println("Name :" + name);

	}

}
