package com.abstract_class.cake;

public class CakeMain {
	public static void main(String[] args) {
		OrderedCake o = new OrderedCake();
		o.showCake();
		o = new OrderedCake("heart", "chocolate", 2);
		o.showCake();
		o = new OrderedCake("square", "Strawberry", 3, null);
		o.showCake();
		o = new OrderedCake("heart", "chocolate", 4, "Happy Birth Day");
		o.showCake();
	}
}