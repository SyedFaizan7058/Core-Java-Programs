package com.saturday;

public class SmartHomeDevice {

	protected String type;
	protected boolean status;

	public SmartHomeDevice(String type, boolean status) {
		super();
		this.type = type;
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void turnOn() {

		System.out.println("Voice Assistance is turned on");

	}

	public void turnOff() {

		System.out.println("Voice Assistance is turned off");

	}

}
