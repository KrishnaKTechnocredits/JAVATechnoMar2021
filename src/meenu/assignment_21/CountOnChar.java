package meenu.assignment_21;

/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

*/

import java.util.Scanner;

public class CountOnChar {

	void StringCount(String word) {
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		int lettersCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;
		
		for (int index = 0;index<word.length();index++) {
			if(word.charAt(index)>= 65 && word.charAt(index)<= 90){
				upperCaseCount++;
				lettersCount++;
			}else if (word.charAt(index)>= 97 && word.charAt(index)<= 122){
				lowerCaseCount++;
			    lettersCount++;
			}else if (word.charAt(index)>= 48 && word.charAt(index)<=57)
			    digitCount++;
			else
				specialCharCount++;
		}
		System.out.println("Total digit count : " + digitCount);
		System.out.println("Total letters count : " + lettersCount);
		System.out.println("Total Uppercase count: " + upperCaseCount);
		System.out.println("Total Lowercase count: " + lowerCaseCount);
		System.out.println("Total Special characters count: " + specialCharCount);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String word = scanner.next();
		CountOnChar countOnChar = new CountOnChar();
		countOnChar.StringCount(word);
	}
}


