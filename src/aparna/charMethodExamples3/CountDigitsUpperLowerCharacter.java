/*Assignment 20:-
 * 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */

package aparna.charMethodExamples3;

import java.util.Scanner;

public class CountDigitsUpperLowerCharacter {

	public void digitUpperLowerSpecialCount(String inputName) {
		int upperCharCount = 0;
		int lowerCharCount = 0;
		int digitCharCount = 0;
		int specialCharCount = 0;
		for (int index = 0; index < inputName.length(); index++) {
			char saveEachChar = inputName.charAt(index);

			if (Character.isUpperCase(saveEachChar)) {
				upperCharCount++;
			} else if (Character.isLowerCase(saveEachChar)) {
				lowerCharCount++;
			} else if (Character.isDigit(saveEachChar))
				digitCharCount++;
			else {
				specialCharCount++;
			}
		}
		System.out.println(" Total digit Characters Count: " + digitCharCount + "\n Total Letters Count: "
				+ (upperCharCount + lowerCharCount) + "\n Total UpperCase Characters Count: " + upperCharCount
				+ "\n Total LowerCase Characters Count: " + lowerCharCount + "\n Total Special Characters Count : "
				+ specialCharCount);
	}

	public static void main(String[] args) {
		CountDigitsUpperLowerCharacter countDigitsUpperLowerCharacter = new CountDigitsUpperLowerCharacter();
		// countDigitsUpperLowerCharacter.digitUpperLowerSpecialCount("1rRpd3F9#K(E");

		// Through Scanner Class:-
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Input Name: ");

		String inputStringName = scanner.next();
		countDigitsUpperLowerCharacter.digitUpperLowerSpecialCount(inputStringName);
		scanner.close();
	}

}
