package vaibhav.Practive.Collections.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Example1 {

	public static void main(String[] args) {

		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();

		String s1 = studentMap.put(3, "Vaibhav");
		String s2 = studentMap.put(1, "Neha");
		String s3 = studentMap.put(2, "Madhvi");
		String s4 = studentMap.put(2, "Simmi");
		String s5 = studentMap.put(4, "Simmi");
		
		System.out.println(studentMap);
		
		LinkedList<String> studentArrList = new LinkedList<String>();
		studentArrList.add(s1);
		studentArrList.add(s2);
		studentArrList.add(s3);
		studentArrList.add(s4);
		studentArrList.add(s5);
		System.out.println(studentArrList);
		
		// String name = studentMap.get(2);
		// System.out.println(name);
		// System.out.println(studentMap.size()); // 4
		// System.out.println(temp);

	}

}
