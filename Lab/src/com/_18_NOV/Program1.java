package com._18_NOV;

interface IVehicle {

	void startEngin();

	void stopEngin();

	void checkFuelLevel();
}

abstract class Vehicle implements IVehicle {

	private String make;
	private String model;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public void startEngin() {

		System.out.println("Vehicle Engin started");

	}

	@Override
	public void stopEngin() {

		System.out.println("Vehicle Engin stop");

	}

	@Override
	public void checkFuelLevel() {

		System.out.println();
	}

}

class Car extends Vehicle {

	public void playMusic() {

		System.out.println("Music is Playing in Car...");

	}

	@Override
	public void startEngin() {

		System.out.println("Car Engin started");

	}

	@Override
	public void stopEngin() {

		System.out.println("Car Engin stop");

	}

	@Override
	public void checkFuelLevel() {

		System.out.println();
	}

}

class Bus extends Vehicle {

	public void announceNextStop() {

		System.out.println("Next stop is Ameerpet.....");

	}

	@Override
	public void startEngin() {

		System.out.println("Bus Engin started");

	}

	@Override
	public void stopEngin() {

		System.out.println("Bus Engin stop");

	}

	@Override
	public void checkFuelLevel() {

		System.out.println();
	}

}

class Truck extends Vehicle {

	public void carryLoad() {

		System.out.println("Carring Food");

	}

	@Override
	public void startEngin() {

		System.out.println("Truck Engin started");

	}

	@Override
	public void stopEngin() {

		System.out.println("Truck Engin stop");

	}

	@Override
	public void checkFuelLevel() {

		System.out.println();
	}
}

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		car.startEngin();
		car.playMusic();
		car.stopEngin();
		System.out.println("---------------------------");
		Bus bus = new Bus();
		bus.startEngin();
		bus.announceNextStop();
		bus.stopEngin();
		System.out.println("---------------------------");
		Truck truck = new Truck();
		truck.startEngin();
		truck.carryLoad();
		truck.stopEngin();
		
		float f=10.5F;
		int a=10;
		System.out.println(a+f);
		

	}

}
