package com.method;

public class oddRounder {
	
	public static int getRoundSum(int num) {
		
		if(num==0) {
			return -2;
		}else if(num<0) {
			return -1;
		}else if(num%2==0) {
			return num;
		}else {
			num/=10;
			num++;
			num*=10;
		}
		return num;
	}

}
