/*
 2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all digits in String is: 53

Note :- Without using character class method.
 */

package paras.Assignment_21;

import java.util.Scanner;

public class SumOfNumbers {
	
	void sum(String input) {
		int sum = 0;
		for(int index= 0; index < input.length(); index++) {
			if(input.charAt(index) >= 48 && input.charAt(index) <= 57) {
				sum = sum + (Integer.parseInt(""+input.charAt(index)));
			}
		}
		System.out.println("Sum of all the numbers in given String is: " + sum);
	}
	
	public static void main(String[] args) {
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		System.out.println("Plese Enter String: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		sumOfNumbers.sum(input);
		
	}
}
