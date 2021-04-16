/* WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package ashtha.Assignment20;

import java.util.Scanner;

public class SumOfNumbers {

	int numberSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length();index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum+num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input String");
		String inputString = scanner.next();
		int result = sumOfNumbers.numberSum(inputString);
		System.out.println("Sum of all digits in String is: " + result);
		scanner.close();
	}
}
