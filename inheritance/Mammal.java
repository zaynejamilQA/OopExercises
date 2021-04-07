package com.qa.oopexercises.inheritance;

public class Mammal extends Animal {
	private boolean warmBlood = true;
	private boolean hasFur;

	public Mammal(boolean hasFur, int hasLegs, String species) {
		this.hasFur = hasFur;
		this.setHasLegs(hasLegs);
		this.setSkeleton(true);
		this.setSpecies(species);
	}

	public boolean isWarmBlood() {
		return warmBlood;
	}

	public void setWarmBlood(boolean warmBlood) {
		this.warmBlood = warmBlood;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
}
