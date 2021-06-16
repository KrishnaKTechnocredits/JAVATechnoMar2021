package sai.codingexam21;

import java.util.ArrayList;
import java.util.Arrays;

public class ReplaceTH {

	String replaceWord(String str) {
		String output = "";
		String[] word = str.split(" ");
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList(word));
		for (String currentWord : arr) {
			if (currentWord.contains("th")) {
				currentWord = currentWord.replace("th", "ht");
			} else if (currentWord.contains("Th")) {
				currentWord = currentWord.replace("Th", "hT");
			}
			output = output + currentWord + " ";
		}
		return output + " ";
	}

	public static void main(String[] args) {
		ReplaceTH replace = new ReplaceTH();
		String input = "This is the thread that given";
		String output = replace.replaceWord(input);
		System.out.println("Output String : " + output);
	}
}
