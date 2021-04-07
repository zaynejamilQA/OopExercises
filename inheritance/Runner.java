package com.qa.oopexercises.inheritance;

public class Runner {

	public static void main(String[] args) {
		Mammal monty = new Mammal(true, 4, "Dog");
		monty.sleep();
		monty.feed(true);
		System.out.println(monty.getSpecies());
		
		Fish bob = new Fish("Freshwater", "Goldfish");
		System.out.println(bob.getHasLegs());
		bob.swim();
		
		Insect buzz = new Insect(true, 6, 6, true);
		buzz.sting();
		
	}

}
