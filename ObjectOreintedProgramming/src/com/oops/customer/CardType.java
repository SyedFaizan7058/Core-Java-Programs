package com.oops.customer;

public class CardType {

	private String cardType;
	private Customer customer;

	public CardType(String cardType, Customer customer) {
		super();
		this.cardType = cardType;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "The Customer '" + customer + "' Is Eligible For '" + cardType + "' Card";
	}

}
