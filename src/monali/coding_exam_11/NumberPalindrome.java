package monali.coding_exam_11;


public class NumberPalindrome {

	void isPalindromeNum(int num) {
		int sum = 0;
		int originalNum = num;
		while (num != 0) {
			int remainder = num % 10;
			sum = sum * 10 + remainder;
			num /= 10;
		}
		if (originalNum == sum) {
			System.out.println(originalNum + " number is palindrome ");
		} else {
			System.out.println(originalNum + " number is not palindrome ");
		}

	}

	public static void main(String[] args) {
		NumberPalindrome q = new NumberPalindrome();
		q.isPalindromeNum(12323);
	}
}
