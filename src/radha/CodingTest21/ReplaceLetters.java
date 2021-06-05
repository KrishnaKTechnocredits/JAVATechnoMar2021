/*
Test - 21 : 4th Jun'2021

String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given

 */
package radha.CodingTest21;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceLetters {
	
	String getReplacedString(String str1) {
		String output = "";
		String[] words = str1.split(" ");
		ArrayList<String> strWords = new ArrayList<String>(Arrays.asList(words));
		for(String currentWord:strWords) {
			if(currentWord.contains("th")) {
				currentWord = currentWord.replace("th", "ht");
			}else if(currentWord.contains("Th")) {
				currentWord = currentWord.replace("Th", "hT");
			}
			output=output+currentWord+" ";
		}
		return output+" ";
	}
	
	public static void main(String[] args) {
		ReplaceLetters replace = new ReplaceLetters();
		String input = "This is the thread that given";
		String output= replace.getReplacedString(input);
		System.out.println("Output String : "+output);
	}
}
