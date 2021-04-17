/*Java Assignment 19: 14th April'2021

Program 1: Write a method which will return "Techno" if Uppercase character count is higher then
LowerCase character count, otherwise return "Credits".

Print output in main method.

input : TeCHnoSessionS
output : Credits

*/

package vaibhav.Assignment_19;

import java.util.Scanner;

public class ReturnByCount {

	int cntUpperCase;
	int cntLowerCase;

	String returnString(String name) {

		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch))
				cntUpperCase++;
			else
				cntLowerCase++;
		}

		if (cntUpperCase > cntLowerCase)
			return "Techno";
		else
			return "Credits";
	}

	public static void main(String[] args) {
		ReturnByCount returnByCount = new ReturnByCount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the word with combination of uppercase and lowercase letter : ");
		String name = scanner.next();

		System.out.println("Depending on uppercase and lowercase count in given string output is : "
				+ returnByCount.returnString(name));
		
		System.out.println("Uppercase Count : " + returnByCount.cntUpperCase);
		System.out.println("Lowercase Count : " + returnByCount.cntLowerCase);
		
		scanner.close();

	}

}
