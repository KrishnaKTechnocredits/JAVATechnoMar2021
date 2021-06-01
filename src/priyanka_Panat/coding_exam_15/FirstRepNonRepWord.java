/*
 Test - 15
Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
 */

package priyanka_Panat.coding_exam_15;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstRepNonRepWord {
	String getFirstRepNonRepWords(String input) {
		String output = "";
		String[] inputWords = input.split(" ");
		ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList(inputWords));
		for (String word : listOfWords) {
			if (listOfWords.indexOf(word) != listOfWords.lastIndexOf(word)) {
				output = output + word + " ";
				break;
			}
		}
		for (String word : listOfWords) {
			if (listOfWords.indexOf(word) == listOfWords.lastIndexOf(word)) {
				output = output + word + " ";
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		FirstRepNonRepWord firstRepNonRepWord = new FirstRepNonRepWord();
		String input = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String output = firstRepNonRepWord.getFirstRepNonRepWords(input);
		System.out.println(output);

	}
}
