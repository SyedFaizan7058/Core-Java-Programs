package com.serialization.student;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class RetrieveObject {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("D:\\new\\ Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try (fis) {

			ArrayList<Student> s = (ArrayList<Student>) ois.readObject();
			System.out.println(s);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
