/*Test - 15
Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits
*/

package sandesh.coding_exam_15;

import java.util.Arrays;
import java.util.ArrayList;

public class FirstRepeatingAndNonRepeatingWord {

	private ArrayList<String> getOutputRepeatNonRepeat(String inputStr) {
		String[] strArray = inputStr.trim().split(" ");
		ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList(strArray));
		ArrayList<String> outputList = new ArrayList<String>();
		for (String eachWord : listOfWords) {
			if (listOfWords.indexOf(eachWord) != listOfWords.lastIndexOf(eachWord)) {
				outputList.add(eachWord);
				break;
			}
		}
		for (String eachWord : listOfWords) {
			if (listOfWords.indexOf(eachWord) == listOfWords.lastIndexOf(eachWord)) {
				outputList.add(eachWord);
				break;
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		ArrayList<String> outList = new ArrayList<String>();
		outList = new FirstRepeatingAndNonRepeatingWord().getOutputRepeatNonRepeat(str);
		System.out.println("First Repeating and First Non-Repeating word from given String is -: ");
		System.out.println(outList);
	}
}
