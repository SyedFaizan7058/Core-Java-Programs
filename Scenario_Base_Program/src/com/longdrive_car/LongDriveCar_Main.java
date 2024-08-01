package com.longdrive_car;

public class LongDriveCar_Main {

	public static void main(String[] args) {

		Car car1 = new Car("101", "KIA");
		Car car2 = new Car("102", "Supra");
		Car car3 = new Car("103", "CXR");

		Customer customer1 = new Customer("001", "Azim");
		Customer customer2 = new Customer("002", "Fahad");
		Customer customer3 = new Customer("003", "Affan");

		LongDrive longDrive = new LongDrive();

		longDrive.addCar(car1);
		longDrive.addCar(car2);
		longDrive.addCar(car3);

		longDrive.addCustomer(customer1);
		longDrive.addCustomer(customer2);
		longDrive.addCustomer(customer3);

		longDrive.rentCar(car1, customer1, 5);

		Rental rental = new Rental(car1, customer1, 5);
		longDrive.returnCar(rental);
	}

}
