package oops;

public class B extends A {
	
	int y=10;
	
	public void display() {
		System.out.println("Running display() in B");
	}

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		System.out.println("Value of X in Class A="+obj.x);
		System.out.println("Value of Y in Class B="+obj.y);
		
		// static method calling from  Class A
		A.stMethod();

	}

}
