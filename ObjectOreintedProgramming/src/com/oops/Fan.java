package com.oops;

public class Fan {
	String fanName;
	String fanCoil;
	int fanWings;

	public void initializeProperties(String name, String coil, int wings) {

		fanName = name;
		fanCoil = coil;
		fanWings = wings;
	}

	public void switchOn() {

		System.out.print("Now the fan is start rotating\nCompany name :" + fanName + "\nCoil :" + fanCoil + "\nFan has "
				+ fanWings + " Wings\n");
	}

	public void switchOff() {

		System.out.println("Now the fan stop rotating\nNow the fan is slowly slowly getting off \nCompany name :"
				+ fanName + "\nCoil :" + fanCoil + "\nFan has " + fanWings + " Wings\n");
	}

	public static void main(String[] args) {
		Fan f = new Fan();

		f.initializeProperties("Bajaj", "Built-in", 4);
		f.switchOn();
		System.out.println("---------------------------------------------");
		f.switchOff();
	}

}
