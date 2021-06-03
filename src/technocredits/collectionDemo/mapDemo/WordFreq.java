package technocredits.collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.Set;

public class WordFreq {
	
	void getMaxFreqWord(String input) {
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
		int maxFreq = 0;
		String maxFreqWord = "";
		Set<String> keys= wordFreqMap.keySet();
		for(String currentKey : keys){
			//System.out.println(currentKey  + " : " + wordFreqMap.get(currentKey) );
			if(wordFreqMap.get(currentKey) > maxFreq) {
				maxFreq = wordFreqMap.get(currentKey);
				maxFreqWord = currentKey;
			}
		}
		
		System.out.println(maxFreqWord + ":" + maxFreq);
	}
	
	public static void main(String[] args) {
		new WordFreq().getMaxFreqWord("Hi Credits Credits Hello Techno Techno Hi Hello Credits Credits Credits Hi");
	}
}
