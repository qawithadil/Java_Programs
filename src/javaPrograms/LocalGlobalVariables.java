package javaPrograms;

public class LocalGlobalVariables {

	String gl_name = "Adil";
	int age = 20;

	public static void main(String[] args) {
		// sum();
		int i = 10;
		int age = 30;
		System.out.println("Value of I=" + i);
		LocalGlobalVariables LG = new LocalGlobalVariables();
		/*
		 * Global variables can’t be accessed directly, we need to create an object of
		 * the class to access it.
		 * 
		 */
		System.out.println("Gl_Name=" + LG.gl_name);
		System.out.println("Global Age=" + LG.age);
		System.out.println("Age=" + age); // Always print the local variable name as local overrides to global

	}

}
