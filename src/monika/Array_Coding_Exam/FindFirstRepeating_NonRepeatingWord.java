package monika.Array_Coding_Exam;

import java.util.ArrayList;
import java.util.Arrays;

/*Test - 15
Return first repeating and non repeating word from given input.
String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/
public class FindFirstRepeating_NonRepeatingWord {

	String getFirstRepeatAndNonRepeatWord(String input) {
		
		String output = "";
		String[] arr = input.split(" ");
		ArrayList<String> arrList = new ArrayList<String>(Arrays.asList(arr));
		for (String word : arrList) {
			if (arrList.indexOf(word) != arrList.lastIndexOf(word)) {
				output += word + " ";
				break;
			}
		}

		for (String word : arrList) {
			if (arrList.indexOf(word) == arrList.lastIndexOf(word)) {
				output = output + word;
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		FindFirstRepeating_NonRepeatingWord obj = new FindFirstRepeating_NonRepeatingWord();
		String input = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String result = obj.getFirstRepeatAndNonRepeatWord(input);
		System.out.println(result);
	}
}
