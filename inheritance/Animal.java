package com.qa.oopexercises.inheritance;

public class Animal {

	private boolean skeleton;
	private int hasLegs;
	private String diet;
	private String species;

	public void sleep() {
		System.out.println("zZZZZzzzZZZzzz.....");
	}

	public void feed(boolean a) {
		if (a) {
			System.out.println("Nom Nom Nom");
		} else {
			System.out.println("Im not hungry");
		}
	}

	public boolean isSkeleton() {
		return skeleton;
	}

	public void setSkeleton(boolean skeleton) {
		this.skeleton = skeleton;
	}

	public int getHasLegs() {
		return hasLegs;
	}

	public void setHasLegs(int hasLegs) {
		this.hasLegs = hasLegs;
	}

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

}
