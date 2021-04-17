/*Assignment 21:-
 * 1) Count Digits,Letters, UpperCase characters, LowerCase characters, 
 * Special characters from predefined string without using Character Class Method.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */
package aparna.charMethodExamples4;

import java.util.Scanner;

public class EachLetterCountWithoutCharMethod {

	public void digitUpperLowerSpecialCount(String inputName) {
		int upperCharCount = 0;
		int lowerCharCount = 0;
		int digitCharCount = 0;
		int specialCharCount = 0;
		for (int index = 0; index < inputName.length(); index++) {
			char saveEachChar = inputName.charAt(index);

			if (saveEachChar >= 65 && saveEachChar <= 90) {// A-Z -> 65 to 90
				upperCharCount++;
			} else if (saveEachChar >= 97 && saveEachChar <= 122) {// a-z -> 97 to 122
				lowerCharCount++;
			} else if (saveEachChar >= 48 && saveEachChar <= 57) {// 0-9 -> 48 to 57
				digitCharCount++;
			} else {
				specialCharCount++;// rest will be special characters
			}
		}
		System.out.println(" Total digit Characters Count: " + digitCharCount + "\n Total Letters Count: "
				+ (upperCharCount + lowerCharCount) + "\n Total UpperCase Characters Count: " + upperCharCount
				+ "\n Total LowerCase Characters Count: " + lowerCharCount + "\n Total Special Characters Count : "
				+ specialCharCount);
	}

	public static void main(String[] args) {
		EachLetterCountWithoutCharMethod eachLetterCountWithoutCharMethod = new EachLetterCountWithoutCharMethod();
		// eachLetterCountWithoutCharMethod.digitUpperLowerSpecialCount("1rRpd3F9#K(E");

		// Through Scanner Class:-
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Input Name: ");

		String inputStringName = scanner.next();
		eachLetterCountWithoutCharMethod.digitUpperLowerSpecialCount(inputStringName);
		scanner.close();
	}
}
