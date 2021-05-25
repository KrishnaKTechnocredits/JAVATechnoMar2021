package madhavi_Khasbage.Coding_Exam_11;

/*Programming Test - 11 : 21st May'2021
Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome
input : 15251
output : number is palindrome*/

public class FindIsPalindromNumber {

	void isNumberPalindrom(int input) {
		String str1 = Integer.toString(input);
		StringBuffer sb1 = new StringBuffer(str1);
		sb1.reverse();
		if (str1.equals(sb1.toString())) {
			System.out.println(input + "  >>  Given number is palindrome");
		} else {
			System.out.println(input + "  >>  Given number is not palindrome");
		}
	}

	public static void main(String[] args) {
		FindIsPalindromNumber obdPalindrome = new FindIsPalindromNumber();
		obdPalindrome.isNumberPalindrom(12323);
		obdPalindrome.isNumberPalindrom(15251);
	}
}
