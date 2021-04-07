package com.qa.oopexercises.inheritance;

public class Insect extends Animal {
	private boolean canFly;
	private int eyes;
	private boolean canSting;

	public Insect(boolean canFly, int eyes, int hasLegs, boolean sting) {
		this.canFly = canFly;
		this.eyes = eyes;
		this.setHasLegs(hasLegs);
		this.setSkeleton(true);
		this.setCanSting(sting);
	}

	public void sting() {
		if (canSting) {
			System.out.println("Ouch!");
		} else {
			System.out.println("...");
		}
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public boolean isCanSting() {
		return canSting;
	}

	public void setCanSting(boolean canSting) {
		this.canSting = canSting;
	}

}
