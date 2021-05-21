package anubhav.StringOperations;

import java.util.Scanner;

public class NumberPalindrome {

	void numPal(int input) {
		int sum = 0;
		int temp = input;

		while (temp != 0) {
			int remainder = temp % 10;
			temp = temp / 10;
			sum = temp * 10 + remainder;
		}
		if (sum == input) {
			System.out.println("Number " + input + " is a palindrome");
		} else {
			System.out.println("Number " + input + " is not a palindrome");
		}
	}

	public static void main(String[] args) {
		NumberPalindrome numberPalindrome = new NumberPalindrome();
		numberPalindrome.numPal(123454321);
		numberPalindrome.numPal(1234555453);
	}
}