package vaibhav.Practive.Collections.List;

import java.util.ArrayList;

public class Example5 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Vaibhav");
		names.add("Sandesh");
		names.add("Techno");
		names.add("Credits");
		names.add("Shashank");
		names.add("Prachi");

		// ****************************************************************//
		// **************** Object remove (Object obj) ********************//
		// ****************************************************************//

		System.out.println("Before use of remove : " + names);

		System.out.println("");
		System.out.println("Remove element which is at index 0 ");

		String removedName = names.remove(0);

		System.out.println("After use of remove  : " + names);

		System.out.println("");
		System.out.println("Removed element at index 0 : " + removedName);

		System.out.println("");
		System.out.println("==================================================================================");
		System.out.println("");
		// ****************************************************************//
		// **************** void add (int index, Object obj) **************//
		// ****************************************************************//
		
		System.out.println("Before use of add element at index 2 : " + names);
		System.out.println("");
		System.out.println("add element at index 2 ");
		

		names.add(2, "'Added_Element'");

		System.out.println("After use of remove  : " + names);

	}
}
