package pallavi.coding_exam_12;

import java.util.ArrayList;

public class CountName {
	static int count = 0;

	ArrayList<String> countName(ArrayList<String> input, String targetName) {
		while (input.contains(targetName)) {
			int index = input.indexOf(targetName);
			input.set(index, "Technocredits");
			count++;
		}
		return input;

	}

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Vaibhav");
		name.add("Aashay");
		name.add("Prashant");
		name.add("Aashay");
		name.add("Aashay");
		name.add("Anubhav");
		ArrayList<String> output = new CountName().countName(name, "Aashay");
		System.out.println(output);
		System.out.println("Count is : " +count);

	}

}
