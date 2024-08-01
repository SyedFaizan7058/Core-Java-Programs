package com.functionalInterface.predicate;

import java.util.function.Predicate;

public class CarSearch {
	public static void main(String[] args) {

		Predicate<Car> car = c -> (c.getPrice() >= 10000) && (c.getPrice() <= 30000) && (c.getMileage() < 50000);

		Car car1 = new Car("WW", 25000.0, 45000);

		if (car.test(car1)) {
			System.out.println("Car for sale" + car1);
		} else {
			System.out.println("Car not for sale");
		}
	}
}