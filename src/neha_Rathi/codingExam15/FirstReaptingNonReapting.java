//Test - 15
//Return first repeating and non repeating word from given input.
//String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
//output : Hi Credits

package neha_Rathi.codingExam15;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstReaptingNonReapting {

	static String word(String input) {
		String output = "";
		String[] res = input.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(res));
		for (int index = 0; index < list.size(); index++) {
			if (list.indexOf(list.get(index)) != list.lastIndexOf(list.get(index))) {
				output += list.get(index) + " ";
				break;
			}
		}
		for (int index = 0; index < list.size(); index++) {
			if (list.indexOf(list.get(index)) == list.lastIndexOf(list.get(index))) {
				output += list.get(index);
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		System.out.println(word(str));
	}
}
