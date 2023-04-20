package oops;

public class TestCar {

	public static void main(String[] args) {

		/*
		 * Method is common in child and parentclass with same method and zero arguments
		 * Preference will be given to Child Class method Method overriding is the run
		 * time polymorphism
		 */

		BMW b = new BMW(); // Static polymorphism
		b.start();
		b.stop();
		b.reFuel();
		b.engine();

		System.out.println("*****");
		Car c = new Car();
		c.start();
		c.stop();
		c.reFuel();

		/*
		 * child class object can be referred by parent class known as run time polymorphism
		 * C1 object of CAR  can't access method under BMW c1.reFuel() it's not possible 
		 */
		Car c1 = new BMW(); 
		c1.start();
		c1.reFuel();
		
        
	}

}
