package com.upcasting.bank;

public class Bank_Main {

	public static void main(String[] args) {

		Bank b = new BankA();
		System.out.println(b.getBalance());
		b = new BankB();
		System.out.println(b.getBalance());
		b = new BankC();
		System.out.println(b.getBalance());

	}

}
