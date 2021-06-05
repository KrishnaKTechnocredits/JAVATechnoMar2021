package vaibhav.Practive.Collections.Set;

import java.util.HashSet;

public class Example2 {

	public static void main(String[] args) {

		HashSet<String> setofNames = new HashSet<String>();
		setofNames.add("Vaibhav");
		setofNames.add("Techno");
		setofNames.add("techno");
		setofNames.add("techno");
		setofNames.add("null");
		setofNames.add("null");

		System.out.println(setofNames);

	}
}