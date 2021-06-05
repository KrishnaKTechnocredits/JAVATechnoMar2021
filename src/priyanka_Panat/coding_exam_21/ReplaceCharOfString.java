 /*
Test - 21 : 4th Jun'2021
String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
 */
 
package priyanka_Panat.coding_exam_21;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceCharOfString {
	static String printReplacedString(String input) {
		String[] arr = input.split(" ");
		String output = " ";
		ArrayList<String> listOfWords = new ArrayList<String>(Arrays.asList(arr));
		for (String word : listOfWords) {
			if (word.contains("Th")) {
				word = word.replace("Th", "hT");
			} else if (word.contains("th")) {
				word = word.replace("th", "ht");
			}
			output += word + " ";
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "This is the thread that given";
		System.out.println(printReplacedString(str));
	}
}
