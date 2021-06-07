package vaibhav.Practive.Collections.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FindCharFreqUsingMap {

	void printAllCharFreq(String word) {
		LinkedHashMap<Character, Integer> charFreqMap = new LinkedHashMap<Character, Integer>();

		for (int index = 0; index < word.length(); index++) {
			char currentChar = word.charAt(index);

			if (charFreqMap.containsKey(currentChar)) {
				int count = charFreqMap.get(currentChar) + 1;
				charFreqMap.put(currentChar, count);
			} else {
				charFreqMap.put(currentChar, 1);
			}
		}
		System.out.println(charFreqMap);

	}

	public static void main(String[] args) {
		FindCharFreqUsingMap findCharFreqUsingMap = new FindCharFreqUsingMap();
		findCharFreqUsingMap.printAllCharFreq("Technocredits");
	}
}
