package ami.Coding_Exam_11;

public class Palindrome_int {
	int temp;
	int remainder;
	int sum =0;
	void findPalindrome(int input) {
		temp = input;
		while (input > 0) {
			remainder = input % 10;
			sum = (sum * 10) + remainder;
			input = input / 10;
		}
		if (temp == sum) {
			System.out.println("Number is palindrome :" + temp );
		}

		else
			System.out.println("Number is not palindrome :" + temp);
	}
	
	public static void main(String[] args) {
		Palindrome_int palindrome = new Palindrome_int();
		palindrome.findPalindrome(12323);
		
		Palindrome_int palindrome1 = new Palindrome_int();
		palindrome1.findPalindrome(15251);
		
	}
}
