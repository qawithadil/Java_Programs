package collections;

import java.util.ArrayList;

public class ArrayLst {

	public static void main(String[] args) {

		ArrayList<Integer> alst = new ArrayList<Integer>();
		/*
		 * In built methods implementation
		 */

		for (int i = 0; i < 10; i++) {
			alst.add(i);
		}
		System.out.println("Size of the array list before deletion=" + alst.size());
		System.out.println("Complete Array List=" + alst);
		alst.remove(3);
		System.out.println("Size of the array list after deletion=" + alst.size());
		System.out.println("Array List without 3rd Element=" + alst);

	}

}
