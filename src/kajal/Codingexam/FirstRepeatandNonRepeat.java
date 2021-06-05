/*
 Test - 15 : 28th May'2021

Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
 */
package kajal.Codingexam;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstRepeatandNonRepeat {

	String repeatNonRepeat(String input) {
		ArrayList<String> op = new ArrayList<String>();
		String[] str1 = input.split(" ");

		ArrayList<String> names = new ArrayList<String>(Arrays.asList(str1));
		for (String word : names) {
			if (names.indexOf(word) != names.lastIndexOf(word)) {
				op.add(word);
				break;
			}
		}
		for (String word : names) {
			if (names.indexOf(word) == names.lastIndexOf(word)) {
				op.add(word);
				break;
			}
		}
		return op.toString();
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String ans = new FirstRepeatandNonRepeat().repeatNonRepeat(str);
		System.out.println(ans);
	}

}
