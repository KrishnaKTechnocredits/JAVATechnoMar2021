package mayur.coding_exam_12;

import java.util.ArrayList;

public class ReplaceName {
	int getCount(ArrayList<String> str, String name) {
		int count = 0;
		while (str.contains(name)) {
			count++;
			str.set(str.indexOf(name), "Technocredits");
		}
		System.out.println("String after replacement is: " + str);
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vaibhav");
		names.add("Aashay");
		names.add("Prashant");
		names.add("Aashay");
		names.add("Aashay");
		names.add("Anubhav");
		ReplaceName replace = new ReplaceName();
		System.out.println("Input Array " + names);
		int count = replace.getCount(names, "Aashay");
		System.out.println();
		System.out.println("Name count is : " + count);
	}
}
