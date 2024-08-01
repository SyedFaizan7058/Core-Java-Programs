package com.mobilephone;

public class BSNL implements SIMCardInterface {

	private String phoneNumber;
	private String networkProvider;

	public BSNL(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		this.networkProvider = "BSNL";
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
		// TODO Auto-generated method stub

	}

	@Override
	public String networkProvider() {
		return networkProvider;
		// TODO Auto-generated method stub

	}

	@Override
	public void activation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is Activated");
	}

	@Override
	public void deactivation() {
		// TODO Auto-generated method stub
		System.out.println("Your " + networkProvider() + " Sim Card is De-activated");
	}

}
