package anubhav.StringOperations;

import java.util.Scanner;

/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.
input : TeCHnoSessionS
output : Credits*/

public class ReturnOnBasisOfUpperAndLowerCase {
	
	String enterString(String inputString) {
		int upperCaseCount= 0;
		int lowerCaseCount= 0;
		for (int index=0; index<inputString.length(); index++) {
			char ch= inputString.charAt(index);
			if (Character.isUpperCase(ch))
				upperCaseCount++;
			else
				lowerCaseCount++;
		}
			if 
				(upperCaseCount>lowerCaseCount)
				return "Techno";
			else if
				(upperCaseCount<lowerCaseCount)
				return "Credits";
			else
				return "Equal number of Upper & Lower Case characters";
	}

	public static void main (String[] args) {
		ReturnOnBasisOfUpperAndLowerCase returnUpperLowerString= new ReturnOnBasisOfUpperAndLowerCase();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the string with combination of UpperCase and LowerCase characters :");
		String inputString= scanner.next();
		String toPrint= returnUpperLowerString.enterString(inputString);
		System.out.println(toPrint);
	}
}
