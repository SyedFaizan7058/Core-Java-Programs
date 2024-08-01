package com.saturday;

public class VoiceAssistantIntegration extends SmartHomeDevice {

	public VoiceAssistantIntegration(String type, boolean status) {
		super(type, status);
	}

	public void executeVoiceCommand(String command) {

		if (command == "turn on") {

			super.turnOn();
		} else if (command == "turn off") {

			super.turnOff();
		} else if (command == "dim") {

			System.out.println("adjusting brightness...");
		} else if (command == "set temprature") {

			System.out.println("Setting Temprature...");
		} else {

			System.out.println("Command not recognized");
		}
	}

}
