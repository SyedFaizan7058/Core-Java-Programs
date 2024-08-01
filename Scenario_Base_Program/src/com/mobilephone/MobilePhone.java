package com.mobilephone;

//import com.simcard.SIMCardInterface;

public class MobilePhone implements MobilePhoneInterface {
	boolean t1 = true;

	private SIMCardInterface insertSimCard;

	@Override
	public void insertingSimCard(SIMCardInterface insertSimCard) {
		// TODO Auto-generated method stub
		if (insertSimCard != null && t1) {

			t1 = false;
			this.insertSimCard = insertSimCard;

			System.out
					.println("Your " + insertSimCard.networkProvider() + " Sim Card is Inserted in your mobile Phone");
			insertSimCard.activation();

			System.out.print("You mobile Number is :(+91)" + insertSimCard.getPhoneNumber());

//			insertSimCard = null;

		} else if (insertSimCard != null && t1 != false) {

			System.out.println("*you already inserted the " + insertSimCard.networkProvider() + " SIM Card");
		}

	}

	@Override
	public void removingSimcard() {
		// TODO Auto-generated method stub
		System.out.println(insertSimCard.networkProvider() + " Sim Card Removed ");
		insertSimCard.deactivation();
	}

	@Override
	public void makingCalls(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Making call to " + phoneNumber + "...");

	}

	@Override
	public String sendingTextMessage(String phoneNumber, String message) {
		// TODO Auto-generated method stub
		return "Sendig message to " + phoneNumber + " " + message + " sending...";
	}

}
