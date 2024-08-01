package com.abstract_class.food;

//import java.util.Scanner;

class demo {

	final int x;

	{
		x = 10;
	}

	public demo() {
//		x=10;
	}
}

public class Food_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bread b = new Bread(4.0, 1.1, 13.8, 8);
		System.out.println("" + b.getClass().getSimpleName() + "" + b.getType());
		b.getMacroNutrients();
		System.out.println("Taste :" + b.getTastyScore());
		System.out.println("-------------------");
		Egg e = new Egg(4.0, 1.1, 13.8, 7);
		System.out.println("" + e.getClass().getSimpleName() + "" + e.getType());
		e.getMacroNutrients();
		System.out.println("Taste :" + e.getTastyScore());

	}

}
