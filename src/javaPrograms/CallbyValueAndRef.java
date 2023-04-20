package javaPrograms;

public class CallbyValueAndRef {

	int p;
	int q;

	public static void main(String[] args) {
		CallbyValueAndRef obj = new CallbyValueAndRef();
		int x = 10;
		int y = 20;
		int sum = obj.testSum(x, y); // Call by Value or pass by value
		System.out.println("Sum=" + sum);
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		System.out.println("Value of P=" + obj.p);
		System.out.println("Value of Q=" + obj.q);

	}

	public int testSum(int a, int b) {
		a = 30;
		b = 40;
		int c = a + b;
		return c;
	}

	public void swap(CallbyValueAndRef t) {
		int temp;
		temp = t.p;
		t.p = t.q; // p=60
		t.q = temp; // q=50

	}

}
