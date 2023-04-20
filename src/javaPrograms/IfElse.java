package javaPrograms;

public class IfElse {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		if (a < b) {
			System.out.println("A is less than B");
		} else if (a > b) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("A is equal to B");
		}

		int c = 40;
		int d = 50;
		if (c == d) {
			System.out.println("C and D are equals..");
		} else {
			System.out.println("C is not equal to D..");
		}
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		// nested if else
		
		if(a1>b1 & a1>c1) {
			System.out.println("A1 is greatest");
		}
		else if(b1>c1 & b1>a1) {
			System.out.println("B1 is greatest..");
			
		}
		else {
			System.out.println("C1 is greatest...");
		}
			

	}

}
