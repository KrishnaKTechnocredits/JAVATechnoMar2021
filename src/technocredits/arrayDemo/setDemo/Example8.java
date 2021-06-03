package technocredits.arrayDemo.setDemo;

import java.util.Arrays;
import java.util.TreeSet;

// Unique element
// Duplicate element

public class Example8 {

	public static void main(String[] args) {
		String[] arr = {"maulik","Vaibhav","Maulik","Meenu", "Paras", "Maulik","Meenu"};
		TreeSet<String> setOfNames = new TreeSet<String>(Arrays.asList(arr));
		
		System.out.println(setOfNames.size());
		System.out.println(setOfNames);
	}
}
