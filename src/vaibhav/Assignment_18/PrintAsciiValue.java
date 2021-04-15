/*Java Assignment 18: 14th April 2021

Program 3:  write a method which will print ascii value of A to Z.

*/

package vaibhav.Assignment_18;

import java.util.Scanner;

public class PrintAsciiValue {

	void asciiValue() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Plesae enter the starting character to find the ASCII value : ");
		String str1 = scanner.next();
		char firstCh = str1.charAt(0);

		System.out.println("Please enter the end charater to find the ASCII Value : ");
		String str2 = scanner.next();
		char lastCh = str2.charAt(0);
		scanner.close();

		if ((int) firstCh < (int) lastCh) {
			for (char ch = firstCh; ch <= lastCh; ch++) {
				System.out.println("Ascii Value of " + ch + " is : " + (int)ch);
			}
		} else if ((int) firstCh > (int) lastCh) {
			for (char ch = lastCh; ch <= firstCh; ch++) {
				System.out.println("Ascii Value of " + ch + " is : " + (int)ch);
			}
		} else
			System.out.println("Ascii Value of " + firstCh + " is : " + (int)firstCh);
	}

	public static void main(String[] args) {
		PrintAsciiValue printAsciiValue = new PrintAsciiValue();
		printAsciiValue.asciiValue();
	}
}
