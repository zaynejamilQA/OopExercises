package com.qa.oopexercises.garage;

public class Truck extends Vehicle{
	private int engineTruck;
	public Truck(String fuel, int id, int seats, int engine, String make) {
		super(fuel, id, seats, make);
		this.setEngineTruck(engine);
	}
	@Override
	public String toString() {
		return String.format("MAKE: %s SEATS: %d FUEL: %s ENGINE: %s ID: %d%n", this.getMake(), this.getSeats(), this.getFuel(), this.engineTruck,this.getId());
	}
	public int getEngineTruck() {
		return engineTruck;
	}
	public void setEngineTruck(int engineTruck) {
		this.engineTruck = engineTruck;
	}

	
	
}
