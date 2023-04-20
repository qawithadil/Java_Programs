package collections;

import java.util.Iterator;
import java.util.Stack;

public class StackLst {

	public static void main(String[] args) {

		Stack<String> starray = new Stack<String>();

		starray.push("Starr1");
		starray.push("Starr2");
		starray.push("Starr3");
		starray.push("Starr4");
		starray.push("Starr5");

	// Iterator for stack accessing 
		
		Iterator<String> it = starray.iterator();
		
		System.out.println("*** Elements Are ***");
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		starray.pop();
		
		it=starray.iterator();
		
		System.out.println("** After Popup Ops **");
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}

}
