/*Programming Test - 4 : 12th May'2021

String input = "Hi MAM hello NamaN techno";
output : MAM NamaN*/

package simmi.exam4;

public class PalindromeString {
	void isPalindrome(String input) {

		boolean isFlag = true;

		for (int i = 0, j = input.length() - 1; i <= j; i++, j--) {
			if (input.charAt(i) != input.charAt(j))
				isFlag = false;
			break;
		}
		if (isFlag) {
			System.out.println(input + " is Palindrome");
		}
	}

	void getString(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			isPalindrome(str);
		}
	}

	public static void main(String[] args) {
		String input = "Hi MAM hello NamaN techno";
		String[] str = input.split(" ");
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.getString(str);
	}
}
