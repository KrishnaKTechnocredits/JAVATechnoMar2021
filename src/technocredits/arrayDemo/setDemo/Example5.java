package technocredits.arrayDemo.setDemo;

import java.util.ArrayList;
import java.util.HashSet;

public class Example5 {

	public static void main(String[] args) {
		String[] arr = { "Hi", "Hello", "Hi", "Hi", "Hi" };
		HashSet<String> setOfWords = new HashSet<String>();
		HashSet<String> listOfWords = new HashSet<String>();
		
		for (String word : arr) {
			if (!setOfWords.add(word)) {
				if (!listOfWords.contains(word)) {
					System.out.println(word);
					listOfWords.add(word);
				}
			}
		}
	}
}
