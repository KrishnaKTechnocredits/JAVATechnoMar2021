package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;

public class FindCharFreqUsingMap {

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
	
	void printAllCharFreq(String word) {
		HashMap<Character,Integer> charFreqMap = new HashMap<Character,Integer>();
		for(int index=0;index<word.length();index++) {
			char currentChar = word.charAt(index);
			//System.out.println(currentChar);
			
			if(charFreqMap.containsKey(currentChar)) {
				int cnt = charFreqMap.get(currentChar) + 1;
				charFreqMap.put(currentChar, charFreqMap.get(currentChar) + 1);
			}else {
				charFreqMap.put(currentChar, 1);
			}
		}
		System.out.println(charFreqMap);
		
	}
	
	public static void main(String[] args) {
		new FindCharFreqUsingMap().printAllCharFreq("technocredits");
	}
}
