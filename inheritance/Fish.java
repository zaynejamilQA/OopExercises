package com.qa.oopexercises.inheritance;

public class Fish extends Animal {
	private String waterType;

	public Fish(String type, String species) {
		this.waterType = type;
		this.setHasLegs(0);
		this.setSkeleton(true);
		this.setSpecies(species);
	}

	public void swim() {
		System.out.println("I'm a fish blub blub");
	}

	public String getWaterType() {
		return waterType;
	}

	public void setWaterType(String waterType) {
		this.waterType = waterType;
	}
}
