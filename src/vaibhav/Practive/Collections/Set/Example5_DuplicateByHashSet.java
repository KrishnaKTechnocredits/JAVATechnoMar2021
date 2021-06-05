package vaibhav.Practive.Collections.Set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Example5_DuplicateByHashSet {

	public static void main(String[] args) {

		String[] arr = { "Techno", "Credits", "Techno", "Credits", "Techno" };
		HashSet<String> setOfWords = new HashSet<String>();
		ArrayList<String> listOfWords = new ArrayList<String>();

		for (String word : arr) {
			if (!setOfWords.add(word)) {
				if (!listOfWords.contains(word)) {
					System.out.println("Duplicate word : " + word);
					listOfWords.add(word);
				}
			}
		}
	}
}