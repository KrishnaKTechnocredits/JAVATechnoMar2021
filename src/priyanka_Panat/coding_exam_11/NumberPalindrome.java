/*
 Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome
 */

package priyanka_Panat.coding_exam_11;

public class NumberPalindrome {
	void checkNumIsPalindome(int number) {
		int reverse = 0;
		int temp = number;
		while (number != 0) {
			int rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}
		if (reverse == temp) {
			System.out.println(temp + " is palindrome");
		} else {
			System.out.println(temp + " is not palindome");
		}
	}

	public static void main(String[] args) {
		NumberPalindrome numberPalindrome = new NumberPalindrome();
		numberPalindrome.checkNumIsPalindome(12323);
		numberPalindrome.checkNumIsPalindome(15251);
	}

}
