package com.geeksforgeeks;

public class ParenthesisChecker {

	static boolean ispar(String x) {

		int count = 0;
		String r = "";

		if (x.length() % 2 != 0)
			return false;

		for (int i = 0; i < x.length(); i++) {

			if (x.charAt(i) == '[') {
				r += ']';
				count++;
			} else if (x.charAt(i) == '{') {
				r += '}';
				count++;
			} else if (x.charAt(i) == '(') {
				r += ')';
				count++;
			} else {
				if (x.charAt(i) == r.charAt(count - 1)) {
					r = r.substring(0, r.length() - 1);
					count--;

				} else {
					return false;
				}
			}
		}

		return (count == 0 && r == "") ? true : false;
	}

	public static void main(String[] args) {

		String str = "{([])}";
		System.out.println(ispar(str));

	}

}
