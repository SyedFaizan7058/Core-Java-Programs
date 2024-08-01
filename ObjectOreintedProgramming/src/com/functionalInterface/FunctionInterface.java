package com.functionalInterface;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Double, Double> f = x -> x + 273.15;
		double celsius = 25.0;
		double kelvin = f.apply(celsius);
		System.out.println(celsius + " is equivalent to " + kelvin);

		Function<Double, Double> t = x -> (x - 32) * 5 / 9;
		double fahrenheit = 68;
		double cel = t.apply(fahrenheit);
		System.out.println(fahrenheit + " degree is equivalent to " + cel);
	}

}
