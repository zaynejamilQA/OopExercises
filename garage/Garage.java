package com.qa.oopexercises.garage;

import java.util.ArrayList;

public class Garage {
	
	static ArrayList<Vehicle> garageList = new ArrayList<Vehicle>();
	public static void add(Vehicle v) {
		garageList.add(v);
	}
	public static void price() {
		int i = 0;
		while(i<garageList.size()) {
			if(garageList.get(i) instanceof Car) {
				double price = garageList. * 200;
				
			}
		}
	}
}
