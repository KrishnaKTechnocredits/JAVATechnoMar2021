package krishna.Assignment_20;

import java.util.Scanner;
/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
*/

public class SumOfNumString {
	int sumFind(String stringWord) {
		int sumOfDigit = 0;
		for (int index = 0; index < stringWord.length(); index++) {
			if (Character.isDigit(stringWord.charAt(index)))
				sumOfDigit = sumOfDigit + Character.getNumericValue(stringWord.charAt(index));
		}
		return sumOfDigit;
	}

	public static void main(String[] args) {
		SumOfNumString sumOfNumString = new SumOfNumString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String stringWord = scanner.next();
		System.out.println("Sum of all digits in String is : " + sumOfNumString.sumFind(stringWord));
	}
}
