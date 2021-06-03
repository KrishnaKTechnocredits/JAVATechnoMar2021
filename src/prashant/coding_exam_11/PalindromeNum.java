//Verify whether Number is Palindrome or not
package prashant.coding_exam_11;

public class PalindromeNum {
	void pailndrome(int input) {
		int temp = 0;
		int reversenum = 0;
		int originalinput = input;
		while (input != 0) {
			temp = input % 10;
			reversenum = reversenum * 10 + temp;
			input = input / 10;
		}
		if (reversenum == originalinput) {
			System.out.println("Given Number " + originalinput + " is Palindrome");
		} else {
			System.out.println("Given Number " + originalinput + " is not Palindrome");
		}
	}

	public static void main(String[] args) {
		new PalindromeNum().pailndrome(12323);
		new PalindromeNum().pailndrome(15251);
	}
}
