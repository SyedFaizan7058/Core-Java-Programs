package com.exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {

	public InvalidAgeException() {

	}

	public InvalidAgeException(String message) {
		super(message);
	}
}

public class UserException {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age :");
		int age = sc.nextInt();
		try (sc) {
			if (age < 18) {
				throw new InvalidAgeException("Invalid age!!");
			} else {
				System.out.println("You can give the vote");
			}
		} catch (InvalidAgeException e) {

			e.printStackTrace();
		}

	}

}
