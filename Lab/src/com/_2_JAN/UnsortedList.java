package com._2_JAN;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnsortedList {
	public static void main(String[] args) {
		
		List<Integer> li= new ArrayList<>();
		li.add(10);
		
		System.out.println(Collections.max(li));
		System.out.println(Collections.min(li));
	}

}
