package com.restaurant;

public class Restaurant {

	private String name;
	private String menu;
	private String location;

	public Restaurant(String name, String menu, String location) {
		super();
		this.name = name;
		this.menu = menu;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String getMenu() {
		return menu;
	}

	public String getLocation() {
		return location;
	}
	
	public void displayInfo() {
		
		System.out.println("Restaurant Name :"+name);
		System.out.println("Menu :"+menu);
		System.out.println("Location :"+location);
	}

}
