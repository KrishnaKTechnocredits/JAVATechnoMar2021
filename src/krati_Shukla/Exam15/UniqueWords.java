/*Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/

package krati_Shukla.Exam15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueWords {

	String isRepeat(String str) {
		String[] input = str.split(" ");
		String repeat = "";

		List<String> list = Arrays.asList(input);
		ArrayList<String> output = new ArrayList<String>(list);

		for (String temp : output) {
			if (output.indexOf(temp) != output.lastIndexOf(temp)) {
				repeat = temp;
				break;
			}
		}
		return repeat;
	}

	String isUnique(String str) {
		String[] input = str.split(" ");
		String unique = "";
		int count = 0;
		List<String> list = Arrays.asList(input);
		ArrayList<String> output = new ArrayList<String>(list);

		for (String temp : output) {
			if (output.indexOf(temp) == output.lastIndexOf(temp)) {
				unique = temp;
				break;
			}
		}
		return unique;
	}

	public static void main(String[] args) {
		UniqueWords unique = new UniqueWords();
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String answer1 = unique.isRepeat(str);
		System.out.println("Repeated word is :" + answer1);
		String answer2 = unique.isUnique(str);
		System.out.println("Repeated word is :" + answer2);
	}

}
