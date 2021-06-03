package technocredits.arrayDemo.setDemo;

import java.util.HashSet;

public class Example4 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.add("techno")); // true
		System.out.println(hs.add("Techno")); // false
		System.out.println(hs.add(null)); // true
		System.out.println(hs.add(null)); // false
		
		System.out.println(hs.size());
	}
}
