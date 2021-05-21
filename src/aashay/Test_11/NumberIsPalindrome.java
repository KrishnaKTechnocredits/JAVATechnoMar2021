package aashay.Test_11;
/*
 * Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome
 */

public class NumberIsPalindrome {

	boolean numberPalindrome(int input) {
		int tempNum = 0;
		int duplicateInput = input;

		while (duplicateInput != 0) {
			int remainder = duplicateInput % 10;
			duplicateInput = duplicateInput / 10;
			tempNum = tempNum * 10 + remainder;

		}
		if (tempNum == input)
			return true;
		else
			return false;

	}

	void displaye(boolean result, int input) {
		if (result == true)
			System.out.println("Give number is a Palindrome " + input);
		else
			System.out.println("Give number is not a Palindrome " + input);
	}

	public static void main(String[] args) {

		NumberIsPalindrome numberIsPalindrome = new NumberIsPalindrome();
		boolean isPalindrome;
		int input = 12323;
		isPalindrome = numberIsPalindrome.numberPalindrome(input);
		numberIsPalindrome.displaye(isPalindrome, input);
		input = 15251;
		isPalindrome = numberIsPalindrome.numberPalindrome(input);
		numberIsPalindrome.displaye(isPalindrome, input);

	}

}
