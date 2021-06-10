package aashay.Test_21;
/*
Test - 21 : 4th Jun'2021

String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
*/

import java.util.ArrayList;
import java.util.Arrays;

public class ManipulateString {

	private String getManipulatedString(String input) {
		String output = "";
		String[] inputArray = input.split(" ");
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(inputArray));
		for (String currentWord : list) {
			if (currentWord.contains("th")) {
				currentWord = currentWord.replace("th", "ht");
			} else if (currentWord.contains("Th")) {
				currentWord = currentWord.replace("Th", "hT");
			}
			output +=" "+ currentWord;
		}

		return output;
	}

	public static void main(String[] args) {
		String input = "This is the thread that given";
		String output = new ManipulateString().getManipulatedString(input);
		System.out.println("Output: "+ output);
		
	}

}
