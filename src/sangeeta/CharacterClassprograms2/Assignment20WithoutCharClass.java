/*Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
without character class methods
Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

package sangeeta.CharacterClassprograms2;

import java.util.Scanner;

public class Assignment20WithoutCharClass {
	
	int CountD;
	int CountL;
	int CountUC;
	int CountLC;
	int CountSC;

	void countDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch>=48 && ch<=57)
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
			if (ch<=90 && ch>=65)
				CountUC++;
		}
		System.out.println("Total Uppercase Characters are " + CountUC);
	}

	void countLowerCaseChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch<=122 && ch>=97)
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
		Assignment20WithoutCharClass assignment20WithoutCharClass = new Assignment20WithoutCharClass();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = scanner.next();
		assignment20WithoutCharClass.countDigit(str);
		assignment20WithoutCharClass.countLetters(str);
		assignment20WithoutCharClass.countUpperCaseChar(str);
		assignment20WithoutCharClass.countLowerCaseChar(str);
		assignment20WithoutCharClass.countSpecialChar(str);
	}

}

