package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;

public class Example3 {

	public static void main(String[] args) {
		HashMap<Integer,Boolean> hm = new HashMap<Integer,Boolean>();
		hm.put(1, true);
		hm.put(2, false);
		
		int rollNum = 1;
		boolean presentFlag = hm.get(rollNum);
		if(presentFlag)
			System.out.println("Roll Number "+ rollNum +" was present");
		else
			System.out.println("Not present");
	}
}
