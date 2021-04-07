package com.qa.oopexercises.garage;

public class Runner {

	public static void main(String[] args) {
		Car civic = new Car("Petrol", 1, 5, 130 , "Honda");
		Garage.add(civic);
		Truck eddieStobart = new Truck("Diesel", 2, 3, 1500, "Truck");
		Garage.add(eddieStobart);
		System.out.println(Garage.garageList);
	}

}
