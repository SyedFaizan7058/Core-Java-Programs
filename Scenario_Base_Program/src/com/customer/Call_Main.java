package com.customer;

import java.util.Scanner;

import com.mobilephone.RandomNumber;

abstract class SIMCardInterface {

	public abstract String getPhoneNumber();

	public abstract String networkProvider();

	public abstract void activation();

	public abstract void deactivation();


}

class Airtel extends SIMCardInterface {

	private String phoneNumber;
	private String networkProvider;

	public Airtel(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.networkProvider = "Airtel";
	}

	
	public String getPhoneNumber() {
		return phoneNumber;
		// TODO Auto-generated method stub

	}

	
	public String networkProvider() {
		return networkProvider;
		// TODO Auto-generated method stub

	}

	
	public void activation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is Activated");
	}

	
	public void deactivation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is De-activated");
	}

}

class Jio extends SIMCardInterface {

	private String phoneNumber;
	private String networkProvider;

	public Jio(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.networkProvider = "Jio";
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
		// TODO Auto-generated method stub

	}

	@Override
	public String networkProvider() {
		return networkProvider;
		// TODO Auto-generated method stub

	}

	@Override
	public void activation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is Activated");
	}

	@Override
	public void deactivation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is De-activated");
	}

}

class BSNL extends SIMCardInterface {

	private String phoneNumber;
	private String networkProvider;

	public BSNL(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.networkProvider = "BSNL";
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
		// TODO Auto-generated method stub

	}

	@Override
	public String networkProvider() {
		return networkProvider;
		// TODO Auto-generated method stub

	}

	@Override
	public void activation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is Activated");
	}

	@Override
	public void deactivation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is De-activated");
	}

}

class VI extends SIMCardInterface {

	private String phoneNumber;
	private String networkProvider;

	public VI(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.networkProvider = "Airtel";
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
		// TODO Auto-generated method stub

	}

	@Override
	public String networkProvider() {
		return networkProvider;
		// TODO Auto-generated method stub

	}

	@Override
	public void activation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is Activated");
	}

	@Override
	public void deactivation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is De-activated");
	}

}

interface MobilePhoneInterface {

	void insertingSimCard(SIMCardInterface insertSimCard);

	void removingSimcard();

	void makingCalls(String phoneNumber);

	String sendingTextMessage(String phoneNumber, String message);

}

class MobilePhone implements MobilePhoneInterface {
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

public class Call_Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MobilePhone m = new MobilePhone();
		String call = null;
		String message;
		String number;

		System.out.println("\t\tAvailable Sim Cards");
		System.out.println("--------------------------------------------------");
		System.out.println("\t\t1. Jio Sim");
		System.out.println("\t\t2. Airtel Sim");
		System.out.println("\t\t3. BSNL Sim");
		System.out.println("\t\t4. VI Sim");
		System.out.println("--------------------------------------------------");
		System.out.print("Which sim do you want: ");
		String choice = sc.nextLine();
		System.out.println("--------------------------------------------------");

		SIMCardInterface selectedSim = null;

		String s = "";
		int[] randomNumbers = RandomNumber.getRandomNumber(10, 9);

		for (int randomNumber : randomNumbers) {

			s = s + "" + randomNumber;
		}

		switch (choice) {
		case "1":
			selectedSim = new Jio(s);
			break;
		case "2":
			selectedSim = new Airtel(s);
			break;
		case "3":
			selectedSim = new BSNL(s);
			break;
		default:
			System.out.println("Selected Sim is not available");
		}

		while (call != "no") {

			if (selectedSim != null) {

				m.insertingSimCard(selectedSim);
				System.out.print("\nDo you want to call somebody? Type call/message/no: ");
				call = sc.nextLine();

				if (call.equals("call")) {

					number = getValidPhoneNumber(sc);
					m.makingCalls(number);

				} else if (call.equals("message")) {

					number = getValidPhoneNumber(sc);
					System.out.print("Type a message: ");
					message = sc.nextLine();

					System.out.println(m.sendingTextMessage(number, message));

				} else if (call.equals("no")) {

					System.out.println("Ok, no problem! Enjoy your day!");
					System.exit(100);

				} else {

					System.out.println("Please provide your choice as per requirment!!!");
				}
			}

		}
		sc.close();
	}

	private static String getValidPhoneNumber(Scanner sc) {

		String number;

		do {
			System.out.print("Type your friend's 10-digit phone number: ");
			number = sc.nextLine();
		} while (!(number.length() == 10 && number.matches("\\d{10}")));

		return number;
	}

}
