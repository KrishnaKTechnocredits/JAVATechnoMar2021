/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/
package sangeeta.CharacterClassprograms2;

import java.util.Scanner;

public class CharClassMethodsProgram {
	int CountD;
	int CountL;
	int CountUC;
	int CountLC;
	int CountSC;

	void countDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch))
				CountD++;
		}
		System.out.println("Total digits present in a String are " + CountD);
	}

	void countLetters(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch <= 90 && ch >= 65 || ch <= 122 && ch >= 97)
				CountL++;
		}
		System.out.println("Total letters present in a String are " + CountL);
	}

	void countUpperCaseChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch))
				CountUC++;
		}
		System.out.println("Total Uppercase Characters are " + CountUC);
	}

	void countLowerCaseChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch))
				CountLC++;
		}
		System.out.println("Total digits present in a String are " + CountLC);
	}

	void countSpecialChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 32 && ch <= 47 || ch >= 58 && ch <= 64 || ch >= 91 && ch <= 96 || ch >= 123 && ch <= 126)
				CountSC++;
		}
		System.out.println("Total Special char present in a String are " + CountSC);
	}

	public static void main(String[] a) {
		CharClassMethodsProgram charClassMethodsProgram = new CharClassMethodsProgram();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = scanner.next();
		charClassMethodsProgram.countDigit(str);
		charClassMethodsProgram.countLetters(str);
		charClassMethodsProgram.countUpperCaseChar(str);
		charClassMethodsProgram.countLowerCaseChar(str);
		charClassMethodsProgram.countSpecialChar(str);
	}

}
