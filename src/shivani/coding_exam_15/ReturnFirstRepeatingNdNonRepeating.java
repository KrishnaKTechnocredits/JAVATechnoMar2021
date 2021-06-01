package shivani.coding_exam_15;

import java.util.ArrayList;
import java.util.Arrays;


/*Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/
public class ReturnFirstRepeatingNdNonRepeating {
	
	String getUniqueWordString(String input){
		String output = "";
		String[] wordArray = input.split(" ");
		ArrayList<String> setOfWord = new ArrayList<String>(Arrays.asList(wordArray));

		for (String word : wordArray) {
			if (setOfWord.indexOf(word)!= setOfWord.lastIndexOf(word)) {
				output = output + word + " ";
				break;
			}
		}

		for (String word : wordArray) {
			if (setOfWord.indexOf(word) == setOfWord.lastIndexOf(word)) {
				output = output + word + " ";
				break;
			}
		}
		return output.trim();
	}
public static void main(String[] args) {
	
	ReturnFirstRepeatingNdNonRepeating returnFirstRepeatingNdNonRepeating = new ReturnFirstRepeatingNdNonRepeating();
	String inputString = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
	System.out.println(returnFirstRepeatingNdNonRepeating.getUniqueWordString(inputString));
	
}

}
