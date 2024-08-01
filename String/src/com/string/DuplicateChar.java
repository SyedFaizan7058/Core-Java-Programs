package com.string;

public class DuplicateChar {

	public static void main(String[] args) {

		String str = "aassddffaassddff";
		int count = 0;
		char[] cs = SortedString.sortedString(str);

		char temp = ' ';

		for (int i = 0; i < cs.length - 1; i++) {
			if (cs[i] == cs[i + 1]) {
				if (temp != cs[i]) {
					System.out.print(cs[i] + " ");
					temp = cs[i];
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
