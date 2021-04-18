/*
 Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
 */

package pavan.Assignment19;

import java.util.Scanner;

public class CalUpperLowerCase {
	String checkUpperLower(String userdata) {
		int uppercase = 0;
		int lowercase = 0;
		for (int index = 0; index < userdata.length(); index++) {
			char ch = userdata.charAt(index);
			if (Character.isUpperCase(ch))
				uppercase++;
			if (Character.isLowerCase(ch))
				lowercase++;
		}if (uppercase > lowercase)
			return "Techno";
		else
			return "Credits";
	}
	public static void main(String[] args) {
		CalUpperLowerCase calUpperLowerCase = new CalUpperLowerCase();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a String: ");
		String userdata = scanner.next();
		String output = calUpperLowerCase.checkUpperLower(userdata);
		System.out.println(output);
	}
}