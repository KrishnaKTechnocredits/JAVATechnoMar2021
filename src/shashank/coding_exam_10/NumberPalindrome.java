package shashank.coding_exam_10;

public class NumberPalindrome {

	boolean checkNumPalindrome(int num) {
		int num1 = num;
		int sum = 0;
		while (num > 0) {
			int a;
			a = num % 10;
			sum = sum * 10 + a;
			num = num / 10;
		}
		if (sum == num1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPalindrome numberPalindrome = new NumberPalindrome();
		boolean isNumPalindrome = numberPalindrome.checkNumPalindrome(11711);
		if (isNumPalindrome)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not a palindrome");
	}

}