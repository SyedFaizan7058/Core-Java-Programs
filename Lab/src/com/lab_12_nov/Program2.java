package com.lab_12_nov;

interface HotDrink{
	
	void prepare();
}

class Tea implements HotDrink{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Tea");
	}
	
}

class Coffee implements HotDrink{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Coffee");
	}
		
}

class Horlicks implements HotDrink{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Horlicks");
	}
	
}

class Boost implements HotDrink{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing Boost");
	}
	
}

class Restaurant{
	
	void createObject(HotDrink hk) {
		
		hk.prepare();
	}
	
}

public class Program2 {

	public static void main(String[] args) {
		
		Restaurant r=new Restaurant();
		r.createObject(new Horlicks());

	}

}
