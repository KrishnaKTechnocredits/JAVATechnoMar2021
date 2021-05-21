/*Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome*/

package simmi.exam11;

import java.util.Scanner;

public class PalindromeNumber {
	int checkNum, sum, temp;

	void checkPalindrome(int number) {
		temp = number;
		while (number > 0) {
			checkNum = number % 10;
			sum = sum * 10 + checkNum;
			number = number / 10;
		}
		if (temp == sum) {
			System.out.println("Number is Palindrome");
		} else
			System.out.println("Number not Palindrome");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number to check palindrome");
		int number = scanner.nextInt();
		System.out.println("Enter the second number to check palindrome");
		int number2 = scanner.nextInt();
		new PalindromeNumber().checkPalindrome(number);
		new PalindromeNumber().checkPalindrome(number2);
		scanner.close();
	}
}
