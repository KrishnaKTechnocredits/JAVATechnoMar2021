package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.Set;

public class WordFreq2 {
	
	String getMaxFreqWord(String input) {
		HashMap<String,Integer> wordFreqMap = new HashMap<String,Integer>();
		String[] words = input.split(" ");
		for(int index=0;index<words.length;index++) {
			String currentWord = words[index];
			
			if(wordFreqMap.containsKey(currentWord)) {
				wordFreqMap.put(currentWord, wordFreqMap.get(currentWord) + 1);
			}else {
				wordFreqMap.put(currentWord, 1);
			}
		}
		///System.out.println(wordFreqMap);
		String maxFreqWord = "";
		Set<String> keys= wordFreqMap.keySet();
		for(String currentKey : keys){
			if((wordFreqMap.get(maxFreqWord) == null) || wordFreqMap.get(currentKey) > wordFreqMap.get(maxFreqWord)) {
				maxFreqWord = currentKey;
			}
		}
		String output = maxFreqWord + " freq is " + wordFreqMap.get(maxFreqWord);
		return output;
	}
	
	public static void main(String[] args) {
		new WordFreq2().getMaxFreqWord("Hi Credits Credits Hello Techno Techno Hi Hello Credits Credits Credits Hi");
	}
}
