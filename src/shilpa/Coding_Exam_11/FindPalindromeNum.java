/*Programming Test - 11 : 21st May'2021
Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome*/

package shilpa.Coding_Exam_11;

public class FindPalindromeNum {
	void getPalindrome(int num) {
		int newNum = 0;
		String temp = "";
		int num1 = num;
		for (int index = 0; num > 0; index++) {
			newNum = num % 10;
			num = num / 10;
			temp = temp + newNum;
		}
		if (num1 == Integer.valueOf(temp))
			System.out.println("Palindrom");
		else
			System.out.println("Not palindrome");
	}

	public static void main(String[] args) {
		FindPalindromeNum findPalindromeNum = new FindPalindromeNum();
		findPalindromeNum.getPalindrome(12323);
	}

}
