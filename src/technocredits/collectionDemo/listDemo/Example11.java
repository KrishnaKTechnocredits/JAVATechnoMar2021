package technocredits.collectionDemo.listDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example11 {
	
	static void printDuplicate(String[] input){
		ArrayList<String> list = new ArrayList<String>();
		for(String word : input) {
			if(!list.contains(word))
				list.add(word);
			else if(list.indexOf(word) != list.lastIndexOf(word))
				System.out.println(word + " is duplicate");
		}
	}
	
	public static void main(String[] args) {
		String[] name = {"Techno","Credits","Techno", "Credits", "Techno", "Credits"};
		printDuplicate(name);
	}
}
