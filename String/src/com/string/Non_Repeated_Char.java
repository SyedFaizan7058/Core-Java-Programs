package com.string;

import java.util.Arrays;

public class Non_Repeated_Char {
	
	public static boolean isPalindrome(int x) {

        int rem=0;
        int rev=0;
        int num=x;
        for(;num>0;num/=10){
            rem = num%10;
            rev = rev * 10+rem;
        }

        return rev==x;
    }

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(121));
		

		String str = "mushu";
		char[] cs = str.toCharArray();
		Arrays.sort(cs);
		int count = 0;

		for (int i = 0; i < cs.length-1; i++) {
			if (cs[i] == cs[i + 1]) {
				count++;
			} else if (count == 0)
				System.out.print(cs[i] + " ");
			else
				count = 0;

		}

		for (int i = 0; i < str.length(); i++) {
			boolean flag = true;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) && i != j) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print("\nNot Sorting :" + str.charAt(i) + " ");
			}
		}

	}

}
