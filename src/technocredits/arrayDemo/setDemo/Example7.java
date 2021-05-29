package technocredits.arrayDemo.setDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

// Unique element
// Duplicate element

public class Example7 {

	static public void main(int x) {
		System.out.println("Meenu");
	}
	
	public void main(int x, String y) {
		System.out.println("Meenu");
	}

	public static void main(String[] args) {
		String[] arr = {"maulik","Vaibhav","Maulik","Meenu", "Paras", "Maulik","Meenu"};
		TreeSet<String> setOfNames = new TreeSet<String>();
		
		/*ArrayList<String> al = new ArrayList<String>();
		setOfNames.removeAll(al);
		al.removeAll(setOfNames);*/
		
		
		for(String name : arr) {
			setOfNames.add(name);
		}
		
		System.out.println(setOfNames.size());
		System.out.println(setOfNames);
		
		
	}
}
