/*
Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome
 */

package sourabh.CodingExam_11;

public class NumberPallindrome {
	int getNumberReverse(int num) {
		int ans = 0;
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			ans = ans * 10 + rem;
		}
		return ans;		
	}

	public static void main(String[] args) {
		NumberPallindrome numberPallindrome = new NumberPallindrome();
		int inputNum= 15251;
		int revNum= numberPallindrome.getNumberReverse(inputNum);
		if (revNum == inputNum)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}
}
