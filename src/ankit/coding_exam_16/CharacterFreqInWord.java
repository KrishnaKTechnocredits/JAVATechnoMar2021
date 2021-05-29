package ankit.coding_exam_16;

import java.util.HashMap;

public class CharacterFreqInWord {

	static HashMap<Character, Integer> getFrequencyOfCharacter(String word){
		char[] wordCharArr = word.toCharArray();
		HashMap<Character, Integer> wordHM = new HashMap<Character,Integer>();

		for(char ch: wordCharArr){
			if(wordHM.containsKey(ch)) {
				wordHM.put(ch, wordHM.get(ch)+1);
			}else {
				wordHM.put(ch, 1);
			}
		}return wordHM;
	}

	public static void main(String[] args) {
		String word = "TECHNOCREDITS";
		System.out.println(getFrequencyOfCharacter(word));
	}
}
