/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/

package krati_Jain.Assignment_19;

import java.util.Scanner;

public class CharacterMethodUpperLowerCase {

	public static void main(String[] args) {
		CharacterMethodUpperLowerCase charMethod = new CharacterMethodUpperLowerCase();
		System.out.println(
				"Enter a alphabets string of your choice with a combination of upper and lower cases\nIf upper case count is higher, we will return 'Techno' else 'Credits'");
		Scanner scn = new Scanner(System.in);
		String myString = scn.next();

		System.out.println(charMethod.stringCaseValidation(myString));

	}

	String stringCaseValidation(String myString) {
		int upperCount = 0;
		int lowerCount = 0;
		for (int index = 0; index < myString.length(); index++) {
			char ch = myString.charAt(index);
			if (Character.isUpperCase(ch))
				upperCount++;
			else
				lowerCount++;
		}
		if (upperCount > lowerCount)
			return "Techno";
		else
			return "Credits";

	}

}
