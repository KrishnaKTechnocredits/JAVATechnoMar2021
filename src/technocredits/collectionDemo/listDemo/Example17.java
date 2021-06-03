package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Example17 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Techno");
		al.add("Batch");
		al.add("March2021");
		
		System.out.println(al);
		Collections.sort(al);
		
		System.out.println(al);
		
	}
}
