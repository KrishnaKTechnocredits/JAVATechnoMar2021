package pallavi.coding_exam_11;

/*Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome*/

public class ReverseNumber {

	int isPalindrome(int num) {
		int rev = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;

	}

	public static void main(String[] args) {
		int input = 15251;
		int num = new ReverseNumber().isPalindrome(input);
		if (num == input)
			System.out.println("number is palindrome");
		else {
			System.out.println("number is not palindrome");}

	}

}
