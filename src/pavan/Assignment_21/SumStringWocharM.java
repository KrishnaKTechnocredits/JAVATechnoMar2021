/*
 Assignment 19W/o char method

 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */

package pavan.Assignment_21;

import java.util.Scanner;

public class SumStringWocharM {

	int sumOfNumber = 0;
	
	void getSumofNumbers(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int chi = (int) ch;
			if (chi >= 48 && chi <= 57) {
				sumOfNumber = sumOfNumber + Integer.parseInt(String.valueOf(ch));
			}

		}System.out.println(sumOfNumber);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String in = scan.next();
		SumStringWocharM sumStringWocharM = new SumStringWocharM();
		sumStringWocharM.getSumofNumbers(in);

	}

}
