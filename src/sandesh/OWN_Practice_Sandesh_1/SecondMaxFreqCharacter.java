/*
Test -6 : [Complexity : Easy]
Find a Character having Second maximum frequency.

input : globant india is hiring
output : n
*/

package sandesh.OWN_Practice_Sandesh_1;

import java.util.Arrays;

public class SecondMaxFreqCharacter {

	private int getCountOfEachChar(String normalisedInput, char ch, int index) {
		int charCount = 1;
		for(int innerIndex = index+1; innerIndex < normalisedInput.length(); innerIndex++) {
			if(ch == normalisedInput.charAt(innerIndex)) {
				charCount++;
			}
		}
		return charCount;
	}
	
	private char processString(String input) {
		String normalisedInput = input.toLowerCase().replaceAll("\\s+", "");
		int temp = 0;
		char tempCh = ' ';
		int[] charFreq = new int[normalisedInput.length()];
		char[] charArray = new char[normalisedInput.length()];
		for(int index = 0; index < normalisedInput.length(); index++) {
			if(index != normalisedInput.lastIndexOf(normalisedInput.charAt(index)) && index == normalisedInput.indexOf(normalisedInput.charAt(index))) { // the != condition checks if a character occurs only once. 
				charFreq[index] = getCountOfEachChar(normalisedInput, normalisedInput.charAt(index), index);											 //the == condition is for entering into loop only once during the first occurrence of a multi occuring character
				
				charArray[index] = normalisedInput.charAt(index);
			}
		}
		System.out.println(Arrays.toString(charFreq));
		System.out.println(Arrays.toString(charArray));
		
		for(int index = 0; index < charFreq.length; index++) {
			if(index == 2)
				break;
			for(int innerIndex = index+1; innerIndex < charFreq.length; innerIndex++) {
				if(charFreq[index] < charFreq[innerIndex]) {
					temp = charFreq[index];
					tempCh = charArray[index];
					charFreq[index] = charFreq[innerIndex];
					charArray[index] = charArray[innerIndex];
					charFreq[innerIndex] = temp;
					charArray[innerIndex] = tempCh;
				}
			}
		}
		
		return charArray[1];
	}
	
	public static void main(String[] args) {
		String input = "globant india is hiring";
		char secondMaxChar = new SecondMaxFreqCharacter().processString(input);
		System.out.println("Second Max frequency character in given String is -: " + secondMaxChar);
	}
}
