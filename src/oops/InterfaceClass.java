package oops;

interface animal {
	public void eat();

	public void sleep();

}

class piegon implements animal {

	@Override
	public void eat() {
		System.out.println("Piegon can eat ...");

	}

	@Override
	public void sleep() {
		System.out.println("Piegon can sleep  ...");

	}

}

class duck implements animal {

	@Override
	public void eat() {
		System.out.println("Duck can eat....");

	}

	@Override
	public void sleep() {
		System.out.println("Duck can sleep...");

	}

}

public class InterfaceClass {

	public static void main(String[] args) {

		piegon pg = new piegon();
		pg.eat();
		pg.sleep();

	}

}
