package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoringCustomerObject {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("D:\\new\\Customer.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Scanner sc = new Scanner(System.in);
		System.out.print("How many object You want to create :");
		int object = sc.nextInt();
		try (sc; fos; oos) {

			for (int i = 1; i <=object; i++) {
				Customer c = Customer.getCustomerObject();
				oos.writeObject(c);
			}
		} catch (Exception e) {
			System.err.println("JVM does not have information :" + e);
		}
		System.out.println("Data Stored Successfully");

	}

}
