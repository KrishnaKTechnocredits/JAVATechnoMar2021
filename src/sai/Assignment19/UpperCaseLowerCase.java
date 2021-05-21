package sai.Assignment19;

/*
 * Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits

 */

public class UpperCaseLowerCase {

	
	String CountUpperLower(String input) {
		int upperCase=0;
		int lowerCase=0;
		int length = input.length();
		for (int index=0; index<length; index++) {
			if(Character.isUpperCase(input.charAt(index)))
				upperCase++;
			else
				lowerCase++;
		}
		if (upperCase>lowerCase)
			return "Techno";
		else
			return "Credit";
	}

	public static void main (String[] a) {
		UpperCaseLowerCase upperCaseLowerCase = new UpperCaseLowerCase();
		String input = "TeCHnoSessionS";
		String output = upperCaseLowerCase.CountUpperLower(input);
		System.out.println(output);
	}

}
