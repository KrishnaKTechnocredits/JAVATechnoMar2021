/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
*/
package simmi.assignemnt_19_Case;

import java.util.Scanner;

public class Case {
	static int upperCount = 0;
	static int lowerCount = 0;

	String character() {
		if (upperCount > lowerCount)
			return "Techno";
		else
			return "Credits";
	}

	public static void main(String[] args) {
		Case case1 = new Case();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = scanner.next();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch))
				upperCount++;
			else
				lowerCount++;
		}
		String value = case1.character();
		System.out.println(value);
		scanner.close();
	}

}
