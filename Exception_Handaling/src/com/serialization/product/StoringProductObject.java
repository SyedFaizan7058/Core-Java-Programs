package com.serialization.product;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StoringProductObject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileOutputStream fos = new FileOutputStream("D:\\new\\Product.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Scanner sc = new Scanner(System.in);
		System.out.print("How many object you want to create :");
		int numberOfObjects = sc.nextInt();

		try (sc; fos; oos) {

			for (int i = 1; i <= numberOfObjects; i++) {
				Product productt = Product.getProductObject();
				oos.writeObject(productt);
			}
			System.out.println("Data Stored Successfully!!");
		} catch (Exception exception) {
			System.err.println("JVM does not have any information :" + exception);
		}

	}

}
