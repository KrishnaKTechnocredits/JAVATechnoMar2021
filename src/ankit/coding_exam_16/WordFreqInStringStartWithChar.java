package ankit.coding_exam_16;

import java.util.HashMap;

public class WordFreqInStringStartWithChar {

	static HashMap<String ,Integer> getFrequencyOfEachWord(String str){
		String[] strArr = str.split(" ");
		HashMap<String, Integer> strHM = new HashMap<String, Integer>();
		for(String word: strArr) {
			if(word.startsWith("H")) {
				if(strHM.containsKey(word)) {
					strHM.put(word, strHM.get(word)+1);
				}else {
					strHM.put(word, 1);
				}
			}
		}
		return strHM;
	}

	public static void main(String[] args) {
		String str = "Hi Hi Hello Techno Techno Credit Technocredit Hi hello Techno Automation";
		System.out.println(getFrequencyOfEachWord(str));
	}
}
