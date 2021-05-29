package prachi.Coding_Exam_11;

/*"Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome
input : 15251
output : number is palindrome"
 */

public class VerifyPalindromeNumber {
	void getPalindromeNum(int number) {
		
		int reminder = 0;
		int output = 0;
		int temp = number;
		while(temp>0) {
			reminder = temp%10;
			output = (output*10)+reminder;
			temp = temp/10;
		}

		if(output == number)
			System.out.println(number+": Number is palindrome");
		else
			System.out.println(number+": Number is not palindrome");
	}

	public static void main(String[] args) {
		VerifyPalindromeNumber palindromeNum = new VerifyPalindromeNumber();
		palindromeNum.getPalindromeNum(12323);
		palindromeNum.getPalindromeNum(15251);
	}
}
