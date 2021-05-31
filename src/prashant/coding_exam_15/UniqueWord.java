/*Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/
package prashant.coding_exam_15;

import java.util.Arrays;
import java.util.LinkedList;

public class UniqueWord {
	String getUnique(String input) {
		String str = " ";
		String word[] = input.split(" ");
		boolean flagrepeat = false;
		boolean flagnonrepeat = false;
		LinkedList<String> words = new LinkedList<String>(Arrays.asList(word));
		for (String repeatWord : words) {
			if (words.indexOf(repeatWord) != words.lastIndexOf(repeatWord) && flagrepeat == false) {
				str = str + repeatWord + " ";
				flagrepeat = true;
			}
			if (words.indexOf(repeatWord) == words.lastIndexOf(repeatWord) && flagnonrepeat == false) {
				str = str + repeatWord + " ";
				flagnonrepeat = true;
			}
		}
		return str.trim();
	}

	public static void main(String[] args) {
		String inputstr = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String output = new UniqueWord().getUnique(inputstr);
		System.out.println("first repeating and non repeating word from given string , " +output);
	}
}
