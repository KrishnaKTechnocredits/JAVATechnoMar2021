/*
 Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
 */

package paras.Assignment_19;

import java.util.Scanner;

public class UpperAndLowerChar {
	
	String charCount(String input) {
		
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch))
				upperCaseCount++;
			else
				lowerCaseCount++;
	}
	
	if(upperCaseCount > lowerCaseCount)
		return "Techno";
	else
		return "Credits";
	}
	
	public static void main(String[] args) {
		UpperAndLowerChar upperAndLowerChar = new UpperAndLowerChar();
		System.out.println("Please Enter String: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String output = upperAndLowerChar.charCount(input);
		System.out.println("Output is: " + output);
		
	}
}
