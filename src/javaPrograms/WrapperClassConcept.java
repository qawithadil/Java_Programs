package javaPrograms;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x = "100";
		System.out.println(x + 200);
		int i = Integer.parseInt(x); // Wrapper Class; Convert string to int
		System.out.println(i + 200);
		String y = "12.53";
		double dd = Double.parseDouble(y);
		System.out.println("Value of double=" + dd);

		int j = 100;
		System.out.println(j + 200);

		// int to string
		String s = String.valueOf(j); // Convert int to String
		System.out.println(s + 200); // 100200 
		
		String u="100A";
		int ui=Integer.parseInt(u);
		System.out.println(ui); // Give "NumberFormatException"

	}

}
