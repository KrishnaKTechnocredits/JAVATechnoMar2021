package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;

public class Example4 {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aashvi");
		names.add("Technocredits");
		names.add("Shivani");
		names.add("Radha");
		names.add("Radha");
		
		int indexOfName = names.indexOf("Radha");
		System.out.println(indexOfName);
		System.out.println(names.size());
		String temp = names.set(names.size()-1, "Neha");
		System.out.println(temp);
		System.out.println(names);
		
		boolean isAvailable = names.contains("aashvi");
		System.out.println(isAvailable);
	}
}
