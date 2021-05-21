/*
	 Assignment - 28 : 24th April'2021

	Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
	String msg = "Te1Ch2noCr4e_%$d8iTs9"
	output : 12489TCCTehnoredis
*/

package priyanka_Panat.assignment28;

import java.util.Scanner;

public class SequenceOfStringChar {
	String printString(String str) {
		String digitStr = "";
		String upperCaseStr = "";
		String lowerCaseStr = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				digitStr = digitStr + str.charAt(index);
			} else if (Character.isUpperCase(str.charAt(index))) {
				upperCaseStr = upperCaseStr + str.charAt(index);
			} else if (Character.isLowerCase(str.charAt(index))) {
				lowerCaseStr = lowerCaseStr + str.charAt(index);
			}
		}
		return digitStr + upperCaseStr + lowerCaseStr;
	}

	public static void main(String[] args) {
		SequenceOfStringChar sequenceOfStringChar = new SequenceOfStringChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.next();
		String output = sequenceOfStringChar.printString(str);
		System.out.println(
				"String having all numeric numbers first followed by Capital letters followed by Small letters is : "
						+ output);
		scanner.close();

	}
}
