package shivani.coding_exam_11;
/*Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome*/

public class FindPalindrome {
	int remainder, sum = 0, temp;

	void isPalindrome(int input) {

		temp = input;
		while (input > 0) {
			remainder = input % 10;
			sum = (sum * 10) + remainder;
			input = input / 10;
		}

		if (temp == sum) {
			System.out.println("Number is palindrome" + temp );
		}

		else
			System.out.println("Number is not palindrome" + temp);

	}

	public static void main(String[] args) {
		FindPalindrome findPalindrome = new FindPalindrome();
		findPalindrome.isPalindrome(12323);
		findPalindrome.isPalindrome(15251);
	}
}
