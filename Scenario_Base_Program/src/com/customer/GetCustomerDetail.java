package com.customer;

import java.util.Scanner;

public class GetCustomerDetail {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Customer Name :");
		String name = sc.nextLine();

		System.out.print("Enter Customer Credit Points :");
		int creditPoint = sc.nextInt();

		Customer customer = new Customer(name, creditPoint);

		CardType Card = CardsOnOffer.getOfferedCard(customer);

		System.out.println(Card);

		sc.close();
	}


}
