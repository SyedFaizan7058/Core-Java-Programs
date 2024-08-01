package com.restaurant;

public class FastFoodRestaurant extends Restaurant {

	private boolean driveThru;
	private int numberOfBranches;

	public FastFoodRestaurant(String name, String menu, String location, boolean driveThru, int numberOfBranches) {
		super(name, menu, location);
		this.driveThru = driveThru;
		this.numberOfBranches = numberOfBranches;
	}

	public void displayInfo() {

		super.displayInfo();
		
		if (driveThru == true) {
			System.out.println("Drive-Thru Available ? Yes");
		} else {
			System.out.println("Drive-Thru Available ? No");
		}
		System.out.println("Number of Branches :" + numberOfBranches);

	}

}
