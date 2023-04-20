package oops;

public class Builder extends Architect {

	@Override
	public void p1() {
		System.out.println("This is p1 method..");
		
	}

	@Override
	public void p2() {
		System.out.println("This is p2 method..");
		

	}

	@Override
	public void p3() {
		System.out.println("This is p3 method..");

	}
	
	public static void main(String[] args) {
		Builder bld =  new Builder();
		bld.p1();
		bld.p2();
		bld.p3();
	}

}
