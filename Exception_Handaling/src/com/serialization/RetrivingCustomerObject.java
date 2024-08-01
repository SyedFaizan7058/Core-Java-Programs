package com.serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class RetrivingCustomerObject {

	public static void main(String[] args) throws IOException {

		FileInputStream fin = new FileInputStream("D:\\new\\Customer.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);

		try (fin; ois) {

			Customer customer;
			while ((customer = (Customer) ois.readObject()) != null) {

				System.out.println(customer);

			}
		} catch (EOFException e) {

			System.err.println("File Ended :" + e);

		} catch (Exception e) {

			System.err.println("General Exception");
		}

	}

}
