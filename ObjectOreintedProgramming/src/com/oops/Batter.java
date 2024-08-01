package com.oops;

import java.text.DecimalFormat;

public class Batter {

	private String name;
	private int runs;
	private int matches;
	private double batting_avg;

	public Batter(String name, int runs, int matches) {
		super();
		this.name = name;
		this.runs = runs;
		this.matches = matches;
	}

//	public void batterDetails(String name, int runs, int matches) {
//
//		this.name = name;
//		this.runs = runs;
//		this.matches = matches;
//
//	}

	public void computeBattingAverage() {
		batting_avg = (double) runs / (double) matches;

	}

//	public void getStatistics() {
//
//		//DecimalFormat df = new DecimalFormat("00.00000");
//
//		System.out.print("Name :" + name + "\nBatting_Avg :" + df.format(batting_avg));
//	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("00.00000");
		return "Batter [ name=" + name + ", batting_avg=" + df.format(batting_avg) + " ]";
	}

	public static void main(String[] args) {

		Batter sachin = new Batter("sachin", 18000, 463);

		sachin.computeBattingAverage();

		System.out.println(sachin.toString());

	}

}
