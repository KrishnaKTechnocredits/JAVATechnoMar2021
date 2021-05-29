/*
Test - 15
Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
 */
package radha.CodingTest15;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListRepeatingNonRepeatingWord {
	
	String findWord(String input){
		String output = "";
		String[] wordArr = input.split(" ");
		ArrayList<String> words = new ArrayList<String>(Arrays.asList(wordArr));
		for(String inputWord:words) {
			if(words.indexOf(inputWord)!=words.lastIndexOf(inputWord)) {
				output = output+inputWord + " ";
				break;
			}
		}
		for(String inputWord:words) {
			if(words.indexOf(inputWord)==words.lastIndexOf(inputWord)) {
				output = output+inputWord + " ";
				break;
			}	
		}
		return output.trim();
	}
	
	public static void main(String[] args) {
		ArrayListRepeatingNonRepeatingWord repeating = new ArrayListRepeatingNonRepeatingWord();
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String finalOutput = repeating.findWord(str);
		System.out.println("Output : "+finalOutput);
	}
}