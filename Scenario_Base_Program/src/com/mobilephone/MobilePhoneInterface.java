package com.mobilephone;

//import com.simcard.SIMCardInterface;

public interface MobilePhoneInterface {

	void insertingSimCard(SIMCardInterface insertSimCard);

	void removingSimcard();

	void makingCalls(String phoneNumber);

	String sendingTextMessage(String phoneNumber, String message);

}
