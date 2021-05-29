package technocredits.arrayDemo.setDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

// Unique element
// Duplicate element

public class Example9 {

	public static void main(String[] args) {
		String[] arr = {"maulik","Vaibhav","Maulik","Meenu", "Paras", "Maulik","Meenu"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(al.get(0) + "--" + al.get(al.size()-1));
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>(al);
		System.out.println(lhs);
		
	}
}
