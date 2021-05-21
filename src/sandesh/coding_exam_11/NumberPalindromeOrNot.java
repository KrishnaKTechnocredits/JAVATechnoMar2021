/*
Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome
*/

package sandesh.coding_exam_11;

public class NumberPalindromeOrNot {

	private boolean checkIfNumberPalindrome(int inNum) {
		boolean isPalindrome = false;
		int revNum = 0;
		int temp = inNum;
		while (temp > 0) {
			revNum = (revNum * 10) + temp % 10;
			temp = temp / 10;
		}
		if(revNum == inNum) {
			isPalindrome = true;
		}
		return isPalindrome;
	}
	
	public static void main(String[] args) {
		int input = 121;
		boolean isInputPalindrome = new NumberPalindromeOrNot().checkIfNumberPalindrome(input);
		System.out.println(isInputPalindrome ? "Given number " + input + " is a Palindrome" : "Given number " + input + " is NOT a Palindrome");
	}
}
