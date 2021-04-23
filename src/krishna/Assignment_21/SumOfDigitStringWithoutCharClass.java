package krishna.Assignment_21;

import java.util.Scanner;

/*
 * 2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

 (both program) without using Character class method.
*/
public class SumOfDigitStringWithoutCharClass {
	int sum = 0;

	int SumDigitWithoutChar(String stringWord) {

		for (int index = 0; index < stringWord.length(); index++) {
			char ch = stringWord.charAt(index);
			if (ch >= '0' && ch <= '9') {
				int num = Integer.parseInt(String.valueOf(ch));
				sum += num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfDigitStringWithoutCharClass sumOfDigitStringWithoutCharClass = new SumOfDigitStringWithoutCharClass();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String Word : ");
		String stringWord = scanner.next();

		int sum = sumOfDigitStringWithoutCharClass.SumDigitWithoutChar(stringWord);
		System.out.println("The sum of number in given string is: " + sum);
	}

}
