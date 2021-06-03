package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;

public class Example1 {

	public static void main(String[] args) {
		HashMap<Integer,String> studentMap = new HashMap<Integer,String>();
		studentMap.put(3,"Vaibhav"); // null
		studentMap.put(2,"Krati"); // null
		String temp = studentMap.put(2,"Simmi"); // Madhvi
		if(!temp.equals("Madhvi"))
			studentMap.put(2, temp);
		temp = studentMap.put(4,"Simmi"); 
		studentMap.put(1,"Neha"); // null
		
		System.out.println(temp); // 
		System.out.println(studentMap.size());
		System.out.println(studentMap);
	
	}
}
