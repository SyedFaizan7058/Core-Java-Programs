package com.abstract_class.cake;

public abstract class Cake {

	private String shape;
	private String flavour;
	private int qty;
	private float price;

	protected Cake(String shape, String flavour, int qty) {

		this.shape = shape;
		this.flavour = flavour;
		this.qty = qty;
		setPrice(qty);
	}

	protected void setShape(String shape) {
		this.shape = shape;
	}

	protected String getShape() {
		return shape;
	}

	protected void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	protected String getFlavour() {
		return flavour;
	}

	protected void setQty(int qty) {
		this.qty = qty;
	}

	protected int getQty() {
		return qty;
	}

	protected void setPrice(float price) {
		this.price = qty * 400;
	}

	protected float getPrice() {
		return price;
	}

	protected void showCake() {

		System.out.println("A " + shape + " " + flavour + " Cake of " + qty + " Kg/Kg's Ready @ Rs." + price + "/-");
	}

}
