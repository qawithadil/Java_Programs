package javaPrograms;

class Animal {
	String name;

	void nature() {
		System.out.println("Animal...");
	}
}

class Fish extends Animal {

	String color;

	void nature() {
		System.out.println("Fish Nature...");

	}
}

public class TypeCastobj {

	public static void main(String[] args) {

		Animal a = new Fish();

		// a.color="Blue"; Child class variable can't be access

		a.name = "Gold Fish..";

		System.out.println("Obje A name=" + a.name);
		a.nature();
		Fish f = new Fish();
		f.color = "Blue";
		f.name = "Blue Fish..";
		System.out.println("Object F color=" + f.color);
		System.out.println("Object F name=" + f.name);

	}

}
