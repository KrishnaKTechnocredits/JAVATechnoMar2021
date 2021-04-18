/*
 2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all digits in String is: 53
 */
package paras.Assignment_20;

import java.util.Scanner;

public class SumOfString {

	void sum(String input) {
		int sum = 0;
		
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				int convert = Character.getNumericValue(ch);
				sum += convert;
				
			}
		}
		System.out.println("Sum of all the number in given String is: " + sum);
	}
	
	public static void main(String[] args) {
		SumOfString sumOfString = new SumOfString();
		System.out.println("Please Enter the String: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		sumOfString.sum(input);
	}
}
