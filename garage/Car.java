package com.qa.oopexercises.garage;

public class Car extends Vehicle {
	private int engineCar;

	public Car(String fuel, int id, int seats, int engine, String make) {
		super(fuel, id, seats, make);
		this.setEngineCar(engine);

	}
	@Override
	public String toString() {
		return String.format("MAKE: %s SEATS: %d FUEL: %s ENGINE: %s ID: %d%n", this.getMake(), this.getSeats(), this.getFuel(), this.engineCar,this.getId());
	}
	public int getEngineCar() {
		return engineCar;
	}

	public void setEngineCar(int engine) {
		this.engineCar = engine;
	}
	

}
