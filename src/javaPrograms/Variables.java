package javaPrograms;

public class Variables {
	
	
    int a =10;
    public static int b =100;
	public static void main(String[] args) {
		
		Variables var1 = new Variables();
		var1.callwihoutstatic();
	}
	
	public void callwihoutstatic() {
		System.out.println("Non Static a="+a);
		System.out.println("This method is wothout static variable.");
	}
   
	public static void callwithstatic() {
		System.out.println("Static b="+b);
		System.out.println("This method is with static variable.");
	}
}
