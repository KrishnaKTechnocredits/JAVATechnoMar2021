package vaibhav.Practive.Collections;

import java.util.ArrayList;

public class Example4 {

	ArrayList<String> filterName(ArrayList<String> nameList) {

		ArrayList<String> output = new ArrayList<String>();

		for (int index = 0; index < nameList.size(); index++) {
			if (nameList.get(index).length() > 6) {
				output.add(nameList.get(index));
			}
		}
		return output;
		
	}

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Vaibhav");
		names.add("Sandesh");
		names.add("Techno");
		names.add("Credits");
		names.add("Vaibhav");
		names.add("Prachi");
		
		Example4 example4 = new Example4();
		
		ArrayList<String> expectedFilteredOutput =  example4.filterName(names);
		
		System.out.println(expectedFilteredOutput);
	}
}
