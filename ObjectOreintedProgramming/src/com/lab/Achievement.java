package com.lab;

public class Achievement {

	private String achivementName;
	private boolean isAchive;

	public Achievement(String achivementName, boolean isAchive) {
		super();
		this.achivementName = achivementName;
		this.isAchive = isAchive;
	}

	public String getAchivementName() {
		return achivementName;
	}

	public void setAchivementName(String achivementName) {
		this.achivementName = achivementName;
	}

	public boolean isAchive() {
		return isAchive;
	}

	public void setAchive(boolean isAchive) {
		this.isAchive = isAchive;
	}

	@Override
	public String toString() {
		return "Achievement [achivementName=" + achivementName + ", isAchive=" + isAchive + "]";
	}

}
