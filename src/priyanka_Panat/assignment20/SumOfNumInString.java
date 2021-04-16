/*
 *  Assignment 20:  14th April'2021

 2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all digits in String is: 53
 */
package priyanka_Panat.assignment20;

import java.util.Scanner;

	public class SumOfNumInString {
		int countSum(String input) {
			int sum = 0;
			for (int i = 0; i < input.length(); i++) {
				char ch = input.charAt(i);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}

			}
			return sum;

		}

		public static void main(String[] args) {
			SumOfNumInString sumOfNumInString = new SumOfNumInString();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String");
			String str = sc.next();
			int abc = sumOfNumInString.countSum(str);
			System.out.println("Sum of all digits in String is: " + abc);
			sc.close();
		}
	}

