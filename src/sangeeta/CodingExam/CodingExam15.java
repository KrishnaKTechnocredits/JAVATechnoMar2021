/*Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/

package sangeeta.CodingExam;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingExam15 {

	String getFirstRepeatingAndNonRepeatingWord(String[] str) {
		ArrayList<String> strlist = new ArrayList<String>(Arrays.asList(str));
		ArrayList<String> output = new ArrayList<String>();
		for (String word : strlist) {
			if (strlist.indexOf(word) != strlist.lastIndexOf(word)) {
				output.add(word);
				break;
			}
		}
		for (String word : strlist) {
			if (strlist.indexOf(word) == strlist.lastIndexOf(word)) {
				output.add(word);
				break;
			}
		}
		return output.toString();
	}

	public static void main(String[] args) {
		CodingExam15 codingExam15 = new CodingExam15();
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String[] strarr = str.split(" ");
		String output = codingExam15.getFirstRepeatingAndNonRepeatingWord(strarr);
		System.out.println("First repeated and non-repeated words are: "+output);
	}
}
