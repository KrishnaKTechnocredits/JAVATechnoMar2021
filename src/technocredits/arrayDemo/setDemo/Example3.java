package technocredits.arrayDemo.setDemo;

import java.util.HashSet;
import java.util.TreeSet;

public class Example3 {

	public static void main(String[] args) {
		TreeSet<String> setOfNames = new TreeSet<String>();
		System.out.println(setOfNames.add("Prashant"));
		System.out.println(setOfNames.add("Vaibhav"));
		System.out.println(setOfNames.add("Ami"));
		System.out.println(setOfNames.add("Amruta"));
		System.out.println(setOfNames.add("Ami"));

		System.out.println("Credit".hashCode());
		System.out.println("Ankit".hashCode());
		System.out.println("Twisha".hashCode());
		
		System.out.println(setOfNames.size()); // 4
		System.out.println(setOfNames);

	}
}
