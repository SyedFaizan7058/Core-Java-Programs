package com.practice;

public class Cafe_Main {

	public void createObject(HotDrink hk) {

		hk.prepare();

	}

	public static void main(String[] args) {

		HotDrink hk = new HotDrink() {

			@Override
			public void prepare() {
				// TODO Auto-generated method stub
				System.out.println("Preparing cofee");
			}
		};

		HotDrink hk2 = new HotDrink() {

			@Override
			public void prepare() {
				// TODO Auto-generated method stub
				System.out.println("Preparing juice");
			}
		};

		HotDrink hk3 = new HotDrink() {

			@Override
			public void prepare() {
				// TODO Auto-generated method stub
				System.out.println("Preparing chai");
			}
		};

		Cafe_Main p = new Cafe_Main();
		p.createObject(hk);
		p.createObject(hk2);
		p.createObject(hk3);

		HotDrink hk4 = new HotDrink() {

			@Override
			public void prepare() {
				// TODO Auto-generated method stub
				System.out.println("Preparing horlicks");
			}
		};

		p.createObject(hk4);

	}

}