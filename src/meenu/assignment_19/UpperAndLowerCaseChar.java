package meenu.assignment_19;

/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
*/

import java.util.Scanner;

public class UpperAndLowerCaseChar {
	
	String caseCount(String word) {
		int upperCaseCount = 0;
		int lowerCaseCount = 0;

		for(int index = 0;index<word.length();index++) {
			if(Character.isUpperCase(word.charAt(index)))
				upperCaseCount++;
			else
				lowerCaseCount++;
			}
		if (upperCaseCount > lowerCaseCount)
			return "Techno";
		else
			return "Credits";
	}
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String word = scanner.next();
		UpperAndLowerCaseChar upperAndLowerCaseChar = new UpperAndLowerCaseChar();
		System.out.println(upperAndLowerCaseChar.caseCount(word));
	}

}
