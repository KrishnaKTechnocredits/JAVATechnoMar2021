package anubhav.StringOperations;

/*
Number palindrome 
 */

public class NumberPalindrome {

	void numPal(int input) {
		int reverseNum = 0;
		int inputNum = input;

		while (inputNum != 0) {
			int remainder = inputNum % 10;
			inputNum = inputNum / 10;
			reverseNum = reverseNum * 10 + remainder;
		}
		if (reverseNum == input)
			System.out.println(input + " is a palindrome");
		else
			System.out.println(input + " is not a palindrome");
	}

	public static void main(String[] args) {
		NumberPalindrome numberPalindrome = new NumberPalindrome();
		numberPalindrome.numPal(123454321);
		numberPalindrome.numPal(1234555453);
	}
}