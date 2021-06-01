package vaibhav.Practive.Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {
		HashSet<String> setofNames = new HashSet<String>();
	//	LinkedHashSet<String> setofNames = new LinkedHashSet<String>();
	//	TreeSet<String> setofNames = new TreeSet<String>();

		setofNames.add("Aaa");
		setofNames.add("99F");
		setofNames.add("Bzzzzzz");
		setofNames.add("E");
		setofNames.add("D");
		setofNames.add("Czzzzz");

		System.out.println(setofNames);
		System.out.println();
		
		for (String names : setofNames) {
			System.out.println(names);
		}
	}

	LinkedHashSet<String> setofNames = new LinkedHashSet<String>();

}
