package javaPrograms;

public class StringOps {

	public static void main(String[] args) {
		
		int a =100;
		int b=200;
		String x="Hello";
		String y="World";
		double c=12.33;
		double d=10.33;
		
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);   // 200HelloWorld
		System.out.println(x+y+a+b);   // HelloWorld100200
		System.out.println(x+y+(a+b)); // HelloWorld100300
		System.out.println(a+b+x+y+a+x+b+y); //300HelloWorld100Hello200World
		System.out.println(a+b+x+y+a+b); //300HelloWorld100200
		System.out.println(c+d); // 22.66
		System.out.println(x+y+c+d); // HelloWorld12.3310.33
		
		
	}

}
