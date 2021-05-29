package sai.codingexam10;

public class NumberPalindrome {

	void isNumberPalindrome(int num) {
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int mod = temp % 10;
			temp = temp / 10;
			sum = sum * 10 + mod;
		}
		if (sum == num) {
			System.out.println(num + " is palindrome");
		} else
			System.out.println(num + " is not palindrome");
	}

	public static void main(String[] args) {
		NumberPalindrome numberPalindrome = new NumberPalindrome();
		numberPalindrome.isNumberPalindrome(12323);
		numberPalindrome.isNumberPalindrome(15251);

	}

}
