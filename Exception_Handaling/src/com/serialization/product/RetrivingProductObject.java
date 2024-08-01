package com.serialization.product;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RetrivingProductObject {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\new\\Product.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		try (fis; ois) {

			Product product;
			while ((product = (Product) ois.readObject()) != null) {
				System.out.println(product);

			}

		} catch (Exception exception) {

			System.err.println("File Ended " + exception);

		}

	}

}
