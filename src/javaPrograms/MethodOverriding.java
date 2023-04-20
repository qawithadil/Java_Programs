package javaPrograms;

public class MethodOverriding {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.fuelType();
		Car car = new Car();
		car.fuelType();

	}

}

class Vehicle {

	private void engine() {
		System.out.println("Vehicle Engine..");
	}

	protected void fuelType() {
		System.out.println("Vehicle Fueltype..");
	}

}

class Car extends Vehicle {
	private void engine() {
		System.out.println("Car Fuel type..");
	}

	protected void fuelType() {
		System.out.println("Car Fuel type..");
	}

}
