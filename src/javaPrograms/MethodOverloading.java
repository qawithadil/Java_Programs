package javaPrograms;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading method = new MethodOverloading();
		method.method1(10);
		method.method1(100, "Method2");

	}

	public void method1(int x1) {
		
		System.out.println("Value of x1=" + x1);
	}

	public void method1(int x2, String name2) {
	
		System.out.println("Value of x2=" + x2+" and Name2="+name2);
	}


}
