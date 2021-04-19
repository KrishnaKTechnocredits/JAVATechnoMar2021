package krishna.Assignment_20;

import java.util.Scanner;
/*
 Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/
public class CountOnStringUsingCharacter {
	void stringCount(String stringWord) {
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		int lettersCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		for (int index = 0; index < stringWord.length(); index++) {
			if (Character.isUpperCase(stringWord.charAt(index))) {
				upperCaseCount++;
				lettersCount++;
			}else if (Character.isLowerCase(stringWord.charAt(index))) {
				lowerCaseCount++;
				lettersCount++;
			}else if (Character.isDigit(stringWord.charAt(index)))
				digitCount++;
			else
				specialCharCount++;
		}
		
		System.out.println("Total count of Lowercase is : " + lowerCaseCount);
		System.out.println("Total count of Uppercase is : " + upperCaseCount);
		System.out.println("Total count of letter is : " + lettersCount);
		System.out.println("Total count of digit is : " + digitCount);
		System.out.println("Total count of Special characters is : " + specialCharCount);
	}

	public static void main(String[] args) {
		CountOnStringUsingCharacter CountOnStringUsingCharacter = new CountOnStringUsingCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String Word : ");
		String stringWord = scanner.next();
		CountOnStringUsingCharacter.stringCount(stringWord);
	}
}
