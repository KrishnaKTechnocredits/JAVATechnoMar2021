/*
Test - 15 : 28th May'2021

Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
 */
package paras.Coding_exam_15;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstRepeatingAndNonRepeatingWord {

	String getWords(String input) {

		String[] arr = input.split(" ");
		String output = "";
		ArrayList<String> setOfWords = new ArrayList<String>(Arrays.asList(arr));

		for (String word : setOfWords) {
			if (setOfWords.indexOf(word) != setOfWords.lastIndexOf(word)) {
				output = output + word + " ";
				break;
			}
		}

		for (String word : setOfWords) {
			if (setOfWords.indexOf(word) == setOfWords.lastIndexOf(word)) {
				output = output + word + " ";
				break;
			}
		}
		return output.trim();

	}

	public static void main(String[] args) {
		FirstRepeatingAndNonRepeatingWord firstRepeatingAndNonRepeatingWord = new FirstRepeatingAndNonRepeatingWord();
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		System.out.println(firstRepeatingAndNonRepeatingWord.getWords(str));
	}
}
