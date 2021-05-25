//Verify given number is Palindrome or not.

package krati_Shukla.Exam11;

public class Palindrome {

	void isPalindromeString(String input) {
		boolean flag = false;
		int length = input.length();
		for (int start = 0, end = (length - 1); start <= end; start++, end--) {
			if (input.charAt(start) != input.charAt(end)) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");
	}

	void isPalindromeNumber(int input) {
		int rem = 0;
		int reverse = 0;
		int num = input;
		
		while (num > 0) {
			rem = num % 10;
			reverse = reverse * 10 + rem;
			num = num / 10;
		}
		if (input == reverse)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is not Palindrome");

	}

	public static void main(String[] a) {
		Palindrome palindrome = new Palindrome();
		String str = "abczba";
		int palin = 123251;
		palindrome.isPalindromeString(str);
		palindrome.isPalindromeNumber(palin);
	}

}
