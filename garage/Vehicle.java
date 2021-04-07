package com.qa.oopexercises.garage;

public class Vehicle {
	private String fuel;
	private int id;
	private int seats;
	private String make;

	public Vehicle(String fuel, int id, int seats, String make) {
		this.fuel = fuel;
		this.id = id;
		this.seats = seats;
		this.setMake(make);
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
}
