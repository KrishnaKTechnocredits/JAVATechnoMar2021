package shashank.coding_exam_15;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstRepeatingAndNonRepeatingWord {

	private String getWords(String str) {
		String strArray[] = str.trim().split(" ");
		String output = "";
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(strArray));
		for (int index = 0; index < strArray.length; index++) {
			if (list.indexOf(strArray[index]) != list.lastIndexOf(strArray[index])) {
				output += " First repeating word is " + strArray[index];
				break;
			}
		}
		for (int index = 0; index < strArray.length; index++) {
			if (list.indexOf(strArray[index]) == list.lastIndexOf(strArray[index])) {
				output += " and First Non repeating word is " + strArray[index];
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		FirstRepeatingAndNonRepeatingWord firstRepeatingAndNonRepeatingWord = new FirstRepeatingAndNonRepeatingWord();
		String output = firstRepeatingAndNonRepeatingWord.getWords(str);
		System.out.println(output);
	}

}
