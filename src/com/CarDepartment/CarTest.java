package com.CarDepartment;

public class CarTest {

	public static void main(String[] args) {

		Car car = new Car("Honda Civic" , 123456789);
		
		System.out.println(car.toString());
		
		car.drive(100, "Work");
		
		System.out.println(car.toString());
		
		car.addFuel(100f);
		
		System.out.println(car.toString());
		
	}

}
