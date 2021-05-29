/*Test - 15 : 28th May'2021
Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/

package shilpa.coding_exam_15;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatingNonRepeatingWords {
	String getRepeateNonReapeatWords(String str) {
		String[] strArray = str.split(" ");
		int index1 = 0;
		int index2 = 0;
		String output = "";
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList(strArray));
		for (String word : strList) {
			if ((strList.indexOf(word) == strList.lastIndexOf(word)) && index1 == 0) {
				output += word + " ";
				index1++;
			}
			if ((strList.indexOf(word) != strList.lastIndexOf(word)) && index2 == 0) {
				output += word + " ";
				index2++;
			}
		}
		return output.trim();
	}

	public static void main(String[] args) {
		RepeatingNonRepeatingWords RepeatingNonRepeating = new RepeatingNonRepeatingWords();
		String input = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String output = RepeatingNonRepeating.getRepeateNonReapeatWords(input);
		System.out.println("First repeating and non repeating word from given input");
		System.out.println(output);
	}

}
