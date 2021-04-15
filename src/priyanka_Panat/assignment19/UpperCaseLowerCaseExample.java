/*
 Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
 */
package priyanka_Panat.assignment19;

import java.util.Scanner;

public class UpperCaseLowerCaseExample {
	String findCount(String input) {
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
			} else {
				lowerCaseCount++;

			}
		}
		if (upperCaseCount > lowerCaseCount) {
			return "Techno";
		} else if (upperCaseCount < lowerCaseCount) {
			return "Credits";
		} else {
			return "UpperCase and LowerCase characters are equal";
		}
	}

	public static void main(String[] args) {
		UpperCaseLowerCaseExample upperCaseLowerCaseExample = new UpperCaseLowerCaseExample();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string having UpperCase and LowerCase characters ");
		String str = sc.next();
		System.out.println(upperCaseLowerCaseExample.findCount(str));
		sc.close();

	}

}
