/*Test - 15 : 28th May'2021
Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/

package krati_Jain.codingExam15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FirstRepeatingNonRepeatingWord {

	public static void main(String[] args) {
		FirstRepeatingNonRepeatingWord firstRepeatingNonRepeatingWord = new FirstRepeatingNonRepeatingWord();
		// String str = "Jain Hi Maulik Jain Techno Maulik Credits Techno Credits Maulik
		// Hello Hi";
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String[] strArr = str.split(" ");
		ArrayList<String> listArr = new ArrayList<>(Arrays.asList(strArr));
		System.out.println(firstRepeatingNonRepeatingWord.getRepeatNonRepeat(listArr));
	}

	String getRepeatNonRepeat(ArrayList<String> listArr) {
		HashSet<String> tempSet = new HashSet<String>();
		int numIndex = (listArr.size() - 1); // 8
		int tempIndex = 0;
		String word = "";
		boolean isUnique = true;
		for (String wordToCheck : listArr) {
			if (!tempSet.add(wordToCheck)) { // false Hi Maulik Techno Maulik Credits
				tempIndex = listArr.indexOf(wordToCheck); // 2
				if (tempIndex < numIndex)
					numIndex = tempIndex; // 1
			}
			if (listArr.indexOf(wordToCheck) == listArr.lastIndexOf(wordToCheck) && isUnique) {
				word = wordToCheck;
				isUnique = false;
			}

		}
		return (listArr.get(numIndex)) + " " + word;
	}

}
