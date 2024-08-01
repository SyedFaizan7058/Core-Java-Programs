package com.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTester {

	public static void main(String[] args) {
		
		List<Integer> list = ReversedList.getList(new ArrayList<Integer>(Arrays.asList(3,5,1,4,2)));
		System.out.println("Reverse List :"+list);

	}

}
