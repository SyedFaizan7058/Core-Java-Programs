package com._2_JAN;

import java.util.ArrayList;
import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {

		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("Jupiter");
		arrayList2.add("Saturn");
		arrayList2.add("Uranus");
		arrayList2.add("Neptune");
		arrayList2.add("Sun");

		String s[] = new String[arrayList2.size()];
		String[] arr = arrayList2.toArray(s);
		System.out.println(""+Arrays.toString(arr));

	}

}
