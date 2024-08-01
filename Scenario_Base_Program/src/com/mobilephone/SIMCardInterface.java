package com.mobilephone;

public interface SIMCardInterface {

	String getPhoneNumber();

	String networkProvider();

	void activation();

	void deactivation();

//	public static String rendomNumber() {
//		Random random = new Random();
//		return " "+random.nextInt(10, 15);
//
//	}

}
