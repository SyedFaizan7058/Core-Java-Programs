package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class CheckListPalindrome {

	public static boolean getList(List<Character> list) {

		List<Character> reversedList = new ArrayList<>(list);
		Collections.reverse(reversedList);

		return list.equals(reversedList);

	}
}

public class ListPalindromeTester {

	public static void main(String[] args) {

		boolean list = CheckListPalindrome.getList(new ArrayList<Character>(Arrays.asList('R', 'A', 'D', 'A', 'P')));
		System.out.println(list);

	}

}
