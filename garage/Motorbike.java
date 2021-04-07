package com.qa.oopexercises.garage;

public class Motorbike extends Vehicle {
	private int engineBike;

	public Motorbike(String fuel, int id, int seats, int engine, String make) {
		super(fuel, id, seats, make);
		this.engineBike = engine;
	}
	@Override
	public String toString() {
		return String.format("MAKE: %s SEATS: %d FUEL: %s ENGINE: %s ID: %d%n", this.getMake(), this.getSeats(), this.getFuel(), this.engineBike,this.getId());
	}
	public int getEngineBike() {
		return engineBike;
	}

	public void setEngineBike(int engineBike) {
		this.engineBike = engineBike;
	}

}
