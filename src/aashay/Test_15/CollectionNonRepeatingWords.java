package aashay.Test_15;
/*
 * Test - 15
Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CollectionNonRepeatingWords {

	HashSet<String> getWords(String input) {
		HashSet<String> output = new HashSet<String>();
		String[] inputWords = input.split(" ");
		ArrayList<String> words = new ArrayList<String>(Arrays.asList(inputWords));
		for (String word : words) {
			if (words.indexOf(word) != words.lastIndexOf(word)) {
				output.add(word);
				break;
			}
		}
		for (String word : words) {
			int cntNonRepeatWord = 0;
			if (words.indexOf(word) == words.lastIndexOf(word) && (cntNonRepeatWord < 1)) {
				output.add(word);
				break;
			}
		}

		return output;

	}

	public static void main(String[] args) {
		CollectionNonRepeatingWords collectionNonRepeatingWords = new CollectionNonRepeatingWords();
		String input = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		;
		HashSet<String> output = collectionNonRepeatingWords.getWords(input);
		System.out.println("Anser" + output.toString());

	}

}
