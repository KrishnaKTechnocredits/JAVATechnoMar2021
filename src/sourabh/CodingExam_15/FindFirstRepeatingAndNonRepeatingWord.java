/*
Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
 */

package sourabh.CodingExam_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindFirstRepeatingAndNonRepeatingWord {
	String getFirstRepeatingAndNonRepeatingWord(String strInput) {
		String strOutput = " ";
		String[] arr = strInput.split(" ");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		for (String repeatingWord : arrList) {
			if (arrList.indexOf(repeatingWord) != arrList.lastIndexOf(repeatingWord)) {
				strOutput = strOutput + repeatingWord+" ";
				break;
			}
		}
		for (String nonRepeatingWord : arrList) {
			if (arrList.indexOf(nonRepeatingWord) == arrList.lastIndexOf(nonRepeatingWord)) {
				strOutput = strOutput + nonRepeatingWord+" ";
				break;
			}

		}
		return strOutput;
	}
	public static void main(String[] args) {
		String strInput = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		FindFirstRepeatingAndNonRepeatingWord findFirstRepeatingAndNonRepeatingWord = new FindFirstRepeatingAndNonRepeatingWord();
		String strOutput = findFirstRepeatingAndNonRepeatingWord.getFirstRepeatingAndNonRepeatingWord(strInput);
		System.out.println(strOutput);
	}
}
