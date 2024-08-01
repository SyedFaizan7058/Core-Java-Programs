package com.exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidPanException extends RuntimeException {

	public InvalidPanException() {
	}

	public InvalidPanException(String message) {
		super(message);
	}
}
public class PanException {

	String panNumber;

	public String getPanNumberFromUser() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Pan Card Number :");
		panNumber = sc.nextLine();
		sc.close();
		return panNumber;

	}

	public void validatePanNumber(String panNumber) {

		if (panNumber.length() == 10 && panNumber.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println("Success.");
		} else {
			throw new InvalidPanException("Please provide valid 10 digit number!!");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PanException pe = new PanException();
		try {
			String fromUser = pe.getPanNumberFromUser();
			pe.validatePanNumber(fromUser);
		} catch (Exception e) {
			System.out.println("Example PAN card numbers :");
			System.out.println("ABCDE1234F");
			System.out.println("PQWRT5678M");
			System.out.println("XYZAB9876K");
			e.printStackTrace();

		}

	}

}
