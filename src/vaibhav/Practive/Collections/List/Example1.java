
package vaibhav.Practive.Collections;

import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) { 
		ArrayList<Object> names = new ArrayList<Object>();

		//****************************************************************//
		//**************** boolean add(Object obj) ***********************//
		//**************** Object get (int index) ************************//
		//****************************************************************//
		
		
		boolean b = names.add("Vaibhav");
		names.add("Pooja");
		names.add("Daddy");
	 	names.add(1);
	 	names.add(true);

		System.out.println("add() method returns a boolean value : " + b);
		System.out.println("");
		
		System.out.println("Members if ArrayList");
		System.out.println(names);

		System.out.println("");
		System.out.println("Print each element of ArrayList : ");
		System.out.println("----------------------------------");
		for (int index = 0; index < names.size(); index++) {
			System.out.println(names.get(index));
		}

	}

}