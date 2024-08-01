package com.restaurant;

public class Restaurant_Main {

	public static void main(String[] args) {

		Restaurant r = new Restaurant("Fine Dining", "Gourmet Cuisine", "123 Elegant Street");
		System.out.println("Restaurant Information :");
		r.displayInfo();
		System.out.println("--------------------------");
		FastFoodRestaurant f = new FastFoodRestaurant("Quick Bites", "Burgers and Fries", "456 Fast Lane", true, 10);
		System.out.println("Fast Food Restaurant Information :");
		f.displayInfo();
	}

}
