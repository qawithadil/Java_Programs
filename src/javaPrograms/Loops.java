package javaPrograms;

public class Loops {

	public static void main(String[] args) {
		int i = 1; // initialization
		// 1. While loop
		System.out.println("While Loop...");
		while (i <= 10) // conditional
		{
			System.out.print(i);
			i = i + 1; // incremental .. disadvantage of while loop: generate inifinte loop if don't
						// give incremental
		}

		// 2. For loop
		System.out.println("\n For Loop");
		for (int j = 1; j <= 10; j++) {

			System.out.print(j);
		}

	}

}
