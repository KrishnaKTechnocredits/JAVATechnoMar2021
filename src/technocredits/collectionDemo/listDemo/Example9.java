package technocredits.collectionDemo.listDemo;

import java.util.*;

public class Example9 {

	public static void main(String[] args) {
		String[] names = {"Neha","Krati","Aashya","Shivani","Pallavi","Saurabh"};
		
		for(String currentName : names) {
			if(currentName.contains("i"))
				System.out.println(currentName);
		}
		
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(11);
		numberList.add(17);
		numberList.add(12);
		numberList.add(20);
		numberList.add(17);
		
		int index = 0;
		for(int number : numberList) {
			if(number>15) {
				System.out.println(index);
			}
			index++;
		}
	}
}
