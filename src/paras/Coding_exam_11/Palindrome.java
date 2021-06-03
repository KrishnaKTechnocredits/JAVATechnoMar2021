/*
Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome
 */
package paras.Coding_exam_11;

public class Palindrome {

	void isPalindrome(int num) {
		int sum = 0;
		int temp = num;
		while (temp > 0) {
			int mod = temp % 10;
			temp = temp / 10;
			sum = sum * 10 + mod;
		}
		if (sum == num)
			System.out.println(num + " Number is Palindrome");
		else
			System.out.println(num + " Number is not Palindrome");
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.isPalindrome(12323);
		palindrome.isPalindrome(15251);
	}
}
