package com._2_JAN;

import java.util.ArrayList;
import java.util.Collections;

class ShuffleStudents {

	public static ArrayList<String> doShuffle(ArrayList<String> li) {

		System.out.println("Student List before shuffling :"+li);
		Collections.shuffle(li);
		return li;

	}
}

public class Student {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Rohit");
		list.add("Ram");
		list.add("Ankita");
		list.add("Mahesh");
		list.add("Aarti");

		System.out.println("Student List after shuffling :"+ShuffleStudents.doShuffle(list));

	}

}
