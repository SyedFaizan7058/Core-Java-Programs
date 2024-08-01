package com.practice;

interface Bank {

	public abstract void deposit(int amount);

	public abstract void withdraw(int amount);
}

class Customer implements Bank {

	private double balance = 1000;

	@Override
	public void deposit(int amount) {
		// TODO Auto-generated method stub
		if (amount <= 0) {
			System.out.println("Amount can not be deposited!!!");
		} else {
			balance = balance + amount;
			System.out.println("Your amount after deposit " + balance + " is remeaning");
		}

	}

	@Override
	public void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (balance >= amount) {

			balance = balance - amount;
			System.out.println("Your amount after withdraw " + balance + " is remeaning");

		} else {
			System.out.println("Ensufficiant fund!!!");
		}

	}

}

public class BankTester {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.deposit(5000);
		c.withdraw(7000);
		
//		System.out.println(~ 8);    


	}

}
