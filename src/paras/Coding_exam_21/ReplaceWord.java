/*
String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
*/
package paras.Coding_exam_21;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceWord {

	String wordReplace(String str) {
		String[] arr = str.split(" ");
		String output = "";
		ArrayList<String> Words = new ArrayList<String>(Arrays.asList(arr));
		for (String word : Words) {
			if (word.contains("th")) {
				word = word.replace("th", "ht");
			} else if (word.contains("Th")) {
				word = word.replace("Th", "hT");
			}
			output = output + word + " ";
		}
		return output;
	}

	public static void main(String[] args) {
		ReplaceWord replaceWord = new ReplaceWord();
		String output = replaceWord.wordReplace("This is the thread that given");
		System.out.println(output);
	}
}
