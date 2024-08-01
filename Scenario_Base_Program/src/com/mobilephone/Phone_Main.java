package com.mobilephone;

import java.util.Scanner;

public class Phone_Main {

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
		case "4":
			selectedSim = new VI(s);
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
