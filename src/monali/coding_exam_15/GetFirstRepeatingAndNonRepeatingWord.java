package monali.coding_exam_15;

import java.util.ArrayList;
import java.util.Arrays;

public class GetFirstRepeatingAndNonRepeatingWord {

	String getrepeatingAndNonRepeatingWord(String input) {
		String output = "";
		String[] wordArray = input.split(" ");
		ArrayList<String> setOfWord = new ArrayList<String>(Arrays.asList(wordArray));

		for (String word : setOfWord) {
			if (setOfWord.indexOf(word) != setOfWord.lastIndexOf(word))
				output = output + word + " ";
			break;
		}
		for (String word : setOfWord) {
			if (setOfWord.indexOf(word) == setOfWord.lastIndexOf(word)) {
				output = output + word + " ";
				break;
		}
		}
		System.out.println(output);
		return output;
	}

	public static void main(String[] args) {
		 GetFirstRepeatingAndNonRepeatingWord q = new  GetFirstRepeatingAndNonRepeatingWord();
		String input = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		ArrayList<String> setOfWord = new ArrayList<String>();
		q.getrepeatingAndNonRepeatingWord(input);
	}
}
