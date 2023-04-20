package javaPrograms;

public class TypeCast {

		public static void main(String[] args) {
			int x = 50;
			double y = (double) x; // implicit action
			System.out.println("Value of double Y=" + y);
			double d = 80.8;
			int i = (int) d; // explicit action
			System.out.println("Value of I=" + i);
	
			char ch = (char) x;
			System.out.println("Char ch=" + ch);
	
			char cha = 'Z';
			int chin = (int) cha;
			System.out.println("Chin value =" + chin);
	
		}

}
