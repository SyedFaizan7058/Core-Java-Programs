package com.upcasting;

public class Degree_Main {

	public static void main(String[] args) {

		Degree d = new Undergraduate();
		d.getDegree();

		d = new Postgraduate();
		d.getDegree();

	}

}
