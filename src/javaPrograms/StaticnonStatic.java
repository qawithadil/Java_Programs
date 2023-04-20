package javaPrograms;

public class StaticnonStatic {
	String name = "AD";
	static int age = 25;

	public static void main(String[] args) {

		// Call static method
		// 1. Call direct
		sum();
		// 2. by class name
		StaticnonStatic.sum();
		// Static variable call
		System.out.println("age=" + age);
		System.out.println(StaticnonStatic.age);

		// Call non static functions and variables by creating object of the class

		StaticnonStatic objST = new StaticnonStatic();
		objST.sendmail();
		System.out.println(objST.name);

	}

	public void sendmail() {
		System.out.println("Send Mail Method...");
	}

	public static void sum() {
		System.out.println("Sum Method...");
	}

}
