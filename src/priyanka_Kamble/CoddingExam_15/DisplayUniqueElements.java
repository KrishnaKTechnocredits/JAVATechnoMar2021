package priyanka_Kamble.CoddingExam_15;

import java.util.*;

import javax.jws.soap.SOAPBinding;

public class DisplayUniqueElements {
	
	String getUniqueElements(String inputString) {
		String output = "";
		String[] wordArray = inputString.split(" ");
		HashSet<String> setOfWord = new HashSet<String>();
		
		for(String word : wordArray) {
			if(setOfWord.add(word)){
				output += word + " " ;
			}
		}
		return output;
	}
	
	
	public static void main(String[] args) {
		
		String inputString = "HI Maulik Techno Maulik Credits Maulik Credits Hello Hi";
		System.out.println("Original String -  " + Arrays.asList(inputString));
		//System.out.println("String with Unique elements is -  ");
		String Displayoutput = new DisplayUniqueElements().getUniqueElements(inputString);
		//new DisplayUniqueElements().getUniqueElements(inputString);
		System.out.println("String with Unique elements is -  "+Displayoutput);
	}
}
