package com.abstract_class.cake;

public class OrderedCake extends Cake {

	private String message;

	public OrderedCake() {
		super("Round", "Vanilla", 1);
	}

	public OrderedCake(String shape, String flavour, int qty) {
		super(shape, flavour, qty);
	}

	public OrderedCake(String shape, String flavour, int qty, String message) {
		super(shape, flavour, qty);
		this.message = message;
	}

	@Override
	public void showCake() {

		if (message != null) {

			System.out.println("A " + super.getShape() + " " + super.getFlavour() + " Cake of " + super.getQty()
					+ " Kg/Kg's Ready" + this.message + " @ Rs." + super.getPrice() + "/-");
		} else {
			super.showCake();
		}
	}

}
