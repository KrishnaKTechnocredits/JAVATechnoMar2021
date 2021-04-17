/*
2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */
package upasana.assignment_21;

import java.util.Scanner;

public class SumWithoutCharacterClassMethod {

	void count(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			int asciiVal = str.charAt(index);
			if (asciiVal >= 48 && asciiVal <= 57) {
				int val = asciiVal - '0';
				sum = sum + val;
			}
		}
		System.out.println("Sum of all digits in String " + str + " is: " + sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		String str = scanner.next();
		new SumWithoutCharacterClassMethod().count(str);
		scanner.close();
	}

}
