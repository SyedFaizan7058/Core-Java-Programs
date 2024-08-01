package com.serialization.student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StoreObject {
	public static void main(String[] args) throws IOException {
		
		ArrayList<Student> s = new ArrayList<>();
		Student student = Student.getStudentObject();
		s.add(student);

		FileOutputStream fos = new FileOutputStream("D:\\new\\Student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try (fos; oos) {
			oos.writeObject(student);
			System.out.println("Data Stored Successfully!!");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
