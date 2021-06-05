/*Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
*/


package pavan.PavanB_coding_exam_15;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstRepeatingAndNonRepeating {
	String getFirstRepeatingAndNonRepeatingElement(String input) {
		String output = "";
		String arrWords[] = input.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(arrWords));
		for (String word : list) {
			if (list.indexOf(word) != list.lastIndexOf(word)) {
				output += word + " ";
				break;
			}
		}

		for (String word1 : list) {
			if (list.indexOf(word1) == list.lastIndexOf(word1)) {
				output += word1;
				break;
			}
		}

		return output;
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String output = new FirstRepeatingAndNonRepeating().getFirstRepeatingAndNonRepeatingElement(str);
		System.out.println(output);

	}


}
