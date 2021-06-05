package kangan.Coding.Exam15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedHashSet;

/*Return first repeating and non repeating word from given input.

String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
output : Hi Credits*/

public class ReturnFirst {

	String returnFirstWord(String str) {
		String firstRepeat = "";
		String firstNonRepeat = "";
		String[] wordArray = str.split(" ");
		List<String> newList = Arrays.asList(wordArray);
System.out.println(newList);
		ArrayList<String> output = new ArrayList<String>();
		for (String word : newList) {
			if (firstRepeat == "" && (newList.indexOf(word) != newList.lastIndexOf(word))) {
				output.add(word);
				firstRepeat = firstRepeat + word + " ";
			}
			if ((firstNonRepeat == "") && (newList.indexOf(word) == newList.lastIndexOf(word))) {
				output.add(word);
				firstNonRepeat = firstNonRepeat + word + " ";
			}
		}
		return firstRepeat + firstNonRepeat;

	}

	public static void main(String[] args) {
		ReturnFirst returnFirst = new ReturnFirst();
		String str = "Hi Maulik Techno Maulik Credits Techno Maulik Hello Hi";
		String output = returnFirst.returnFirstWord(str);
		String output1 = output.trim();
		System.out.println(output1);
	}
}
