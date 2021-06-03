package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;

public class Example3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Aashvi");
		names.add("Technocredits");
		names.add("Shivani");
		names.add("Radha");
		names.add("Radha");
		
		System.out.println("Before " + names);
		names.remove(0);
		System.out.println("After " + names);
		
		names.add(names.size(),"Krishna");
		System.out.println(names); // T, K, S, R ,R 
	}
}
