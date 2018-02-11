package com.CarDepartment;

public class Car {
	private String make;
	private Integer license;
	private Float tank;
	private Integer mileage;
	private String location ;
	
	public Car(String make, Integer license) {
		super();
		this.make = make;
		this.license = license;
		this.tank = 40f;
		this.location = "Home";
		this.mileage = 0;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", license=" + license + ", tank=" + tank + ", mileage=" + mileage + ", location=" + location
				+ "]";
	}
	
	public Boolean drive(Integer km , String destination){
		Float fuelNeeded = (float)  km/30;
		if(fuelNeeded <= tank){
			tank -= fuelNeeded;
			location = destination;
			mileage += km;
			return true;
		}else{
			return false;
		}
		
	}
	
	public void addFuel(Float fuel){
		if(this.tank+fuel > 40){
			this.tank = 40f;
		}else{
			this.tank+= fuel;
		}

	}
}
