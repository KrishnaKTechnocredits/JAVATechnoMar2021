/*Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome*/
package kajal.Codingexam;

public class NumberPalindromeorNot {

	void isPailndrome(int input) {
		int temp = 0;
		int reversenum = 0;
		int originalinput = input;
		while (input != 0) {
			temp = input % 10;
			reversenum = reversenum * 10 + temp;
			input = input / 10;
		}
		if (reversenum == originalinput) {
			System.out.println(originalinput + " is Palindrome");
		} else {
			System.out.println(originalinput + " is not Palindrome");
		}
	}

	public static void main(String[] args) {
		new NumberPalindromeorNot().isPailndrome(12323);
		new NumberPalindromeorNot().isPailndrome(1111);
	}
}