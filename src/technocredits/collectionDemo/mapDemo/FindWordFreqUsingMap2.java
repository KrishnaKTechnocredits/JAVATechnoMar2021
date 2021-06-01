package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.TreeMap;

public class FindWordFreqUsingMap2 {

	void alternative(String word) {
		HashMap<Character,Integer> charFreqMap = new HashMap<Character,Integer>();
		/*for(int index=0;index<word.length();index++) {
			char currentChar = word.charAt(index);
			System.out.println(currentChar);
		}*/
		
		char ch[] = word.toCharArray();
		for(int index=0;index<ch.length;index++) {
			char currentChar = ch[index];
			System.out.println(currentChar);
		}
	}
	
	void printAllWordFreq(String input) {
		TreeMap<String,Integer> wordFreqMap = new TreeMap<String,Integer>();
		String[] words = input.split(" ");
		for(int index=0;index<words.length;index++) {
			String currentWord = words[index];
			
			if(wordFreqMap.containsKey(currentWord)) {
				wordFreqMap.put(currentWord, wordFreqMap.get(currentWord) + 1);
			}else {
				wordFreqMap.put(currentWord, 1);
			}
		}
		System.out.println(wordFreqMap);
	}
	
	public static void main(String[] args) {
		new FindWordFreqUsingMap2().printAllWordFreq("Hi Hello Techno Techno Hi Hello Credits Credits Credits Hi");
	}
}
