package com.abstract_class.food;

public class Egg extends Food {

	private String type = " is non-vegetarian";

	public Egg(double protein, double fats, double carbs, double tastyScore) {
		super(protein, fats, carbs, tastyScore);
		// TODO Auto-generated constructor stub
		setTastyScore(tastyScore);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void getMacroNutrients() {
		// TODO Auto-generated method stub
		System.out.println("A egg has " + super.getProtein() + " gms of protein, " + super.getFats()
				+ " gms of fats and " + super.getCarbs() + " gms of carbohydrates.");
	}

}
