package javaPrograms;

public class ArrayConcept {

	public static void main(String[] args) {

		// 1. static array - same type of data type store in it to overcome this problem
		// we use
		// Fixed Size - Size is fixed and you can't go beyond the size >> to overcome
		// this problem we use collections, ArrayList, Hashtable also called dynamic
		// array
		// Similar data type - Only similar types of data stored >> to overcome this
		// problem we use object array

		int i[] = new int[5];
		int j;
		System.out.println("Lengh of Array i=" + i.length);
		for (j = 0; j < i.length; j++) {
			i[j] = j;
			System.out.println(i[j]);
		}

		String s[] = new String[5];
		System.out.println("String Array...");
		for (j = 0; j < s.length; j++) {
			s[j] = "A" + j;
			System.out.print(s[j]);
		}

		// 2. Object Array : Object is a class
		// it is used to store different data type values

		Object ob[] = new Object[5];
		ob[0] = "Hello";
		ob[1] = 100;
		ob[2] = 100.35;
		ob[3] = 'A';
		ob[4] = 8877;

		System.out.println("2. Object Array of different data type...");
		for (j = 1; j < ob.length; j++) {
			System.out.print(ob[j]);
		}

	}

}
