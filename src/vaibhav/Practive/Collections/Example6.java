package vaibhav.Practive.Collections;

import java.util.ArrayList;

public class Example6 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Vaibhav");
		names.add("Sandesh");
		names.add("Techno");
		names.add("Credits");
		names.add("Shashank");
		names.add("Prachi");

		// ************************************************************************//
		// **************** Object set (int index, Object obj) ********************//
		// ************************************************************************//

		System.out.println("Before use of set method : " + names);
		System.out.println("");
		System.out.println("Replace element which is at index 2, using set method ");

		String removedName = names.set(2, "'--Replaced_Element--'");

		System.out.println("After use of set  : " + names);
		System.out.println("");
		System.out.println("Removed element at index 2 : " + removedName);

		// ************************************************************************//
		// **************** boolean contains (Object obj) *************************//
		// ************************************************************************//
		
		System.out.println("Check if 'Vaibhav' is present in given ArrayList ");
		boolean isAvailable = names.contains("Vaibhav");
		System.out.println(isAvailable);
		
		
	}
}
