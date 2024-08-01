package com.saturday;

public class MainSmartHome {

	public static void main(String[] args) {

		VoiceAssistantIntegration v = new VoiceAssistantIntegration("AI", true);
		v.executeVoiceCommand("turn on");
		v.executeVoiceCommand("set temprature");
		v.executeVoiceCommand("dim");
		v.executeVoiceCommand("turn off");

	}

}
