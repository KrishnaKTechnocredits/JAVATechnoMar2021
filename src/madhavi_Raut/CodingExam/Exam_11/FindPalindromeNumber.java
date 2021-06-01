package madhavi_Raut.CodingExam.Exam_11;
/*Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome*/

public class FindPalindromeNumber {

	void isNumberPalindrome(int num) {
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int mod = temp % 10;
			temp = temp / 10;
			sum = sum * 10 + mod;
		}
		if (sum == num)
			System.out.println(num + " is palindrome.");
		else
			System.out.println(num + " is not palindrome.");
	}

	public static void main(String[] args) {
		FindPalindromeNumber findPalindromeNumber = new FindPalindromeNumber();
		findPalindromeNumber.isNumberPalindrome(12323);
		findPalindromeNumber.isNumberPalindrome(15251);
	}
}
