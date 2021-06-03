package technocredits.arrayDemo.setDemo;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class Example1 {

	public static void main(String[] args) {
		LinkedHashSet<String> setOfNames = new LinkedHashSet<String>();
		setOfNames.add("Ami");
		setOfNames.add("Amruta");
		setOfNames.add("Ami");
		setOfNames.add("Ankit");
		setOfNames.add("Ashwini");
		
		System.out.println(setOfNames.size()); // 4
		System.out.println(setOfNames);
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Twish", "");
		hm.put("Credits", "");
		
		Object obj1 = "Twisha";
		Object obj2 = "Credits";
		Object obj3 = "Ankit";
		Object obj4 = "Techno";
		Object obj5 = "Selenium";
		
		int h = obj1.hashCode();
		System.out.println(obj1 + ":" + (h ^ (h >>> 16)));
		
		h = obj2.hashCode();
		System.out.println(obj2 +":"+ (h ^ (h >>> 16)));
		
		h = obj3.hashCode();
		System.out.println(obj3 + ":" + (h ^ (h >>> 16)));
		
		h = obj4.hashCode();
		System.out.println(obj4 + ":" + (h ^ (h >>> 16)));
		
		h = obj5.hashCode();
		System.out.println(obj5 + ":" + (h ^ (h >>> 16)));
	}
}
