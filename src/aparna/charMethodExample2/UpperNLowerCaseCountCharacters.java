/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
 */
package aparna.charMethodExample2;

import java.util.Scanner;

public class UpperNLowerCaseCountCharacters {

	public String upperNLowerCaseCountCharacters(String inputName) {
		int upperCaseCount = 0;

		for (int index = 0; index < inputName.length(); index++) {
			char eachCharacterOfInputName = inputName.charAt(index);
			if (Character.isUpperCase(eachCharacterOfInputName))
				upperCaseCount++;
		}
		if (upperCaseCount > (inputName.length() - upperCaseCount))
			return "Techno";
		else
			return "Credits";
	}

	public static void main(String[] args) {
		UpperNLowerCaseCountCharacters upperNLowerCaseCountCharacters = new UpperNLowerCaseCountCharacters();
		// String Value =
		// upperNLowerCaseCountCharacters.upperNLowerCaseCountCharacters("TeCHnoSessionS");
		// System.out.println(Value);

		// String Value1 =
		// upperNLowerCaseCountCharacters.upperNLowerCaseCountCharacters("TECHNOSessionS");
		// System.out.println(Value1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Input Name: ");

		String inputName = scanner.next();
		String result = upperNLowerCaseCountCharacters.upperNLowerCaseCountCharacters(inputName);
		System.out.println("Output of Given Input Name will be : " + result);
		scanner.close();
	}

}
