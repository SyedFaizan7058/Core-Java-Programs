package com.customer;

public class CardsOnOffer {

	public static CardType getOfferedCard(Customer object) {

		int creditPoint = object.getCreditPoints();

		if (creditPoint >= 100 && creditPoint <= 500) {

			return new CardType("Silver", object);
		} else if (creditPoint > 500 && creditPoint < 1000) {

			return new CardType("Gold", object);
		} else if (creditPoint > 1000) {

			return new CardType("Platinum", object);
		} else {

			return new CardType("EMI", object);
		}

	}

}
