package com.abstract_class.food;

public abstract class Food {

	private double protein;
	private double fats;
	private double carbs;
	private double tastyScore;

	public abstract void getMacroNutrients();

	public Food(double protein, double fats, double carbs, double tastyScore) {
		super();
		this.protein = protein;
		this.fats = fats;
		this.carbs = carbs;
		this.tastyScore = tastyScore;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getFats() {
		return fats;
	}

	public void setFats(double fats) {
		this.fats = fats;
	}

	public double getCarbs() {
		return carbs;
	}

	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}

	public double getTastyScore() {
		return tastyScore;
	}

	public void setTastyScore(double tastyScore) {
		this.tastyScore = tastyScore;
	}

}
