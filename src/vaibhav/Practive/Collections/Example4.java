package vaibhav.Practive.Collections;

import java.util.ArrayList;

public class Example4 {

	ArrayList<String> filterName(ArrayList<String> names) {

		ArrayList<String> output = new ArrayList<String>();

		for (int index = 0; index < names.size(); index++) {
			if (names.get(index).length() > 3) {

				System.out.println(output);
			}
		}
		return output;
	
	
	}

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Vaibhav");
		names.add("Pooja");
		names.add("Daddy");
	}
}
