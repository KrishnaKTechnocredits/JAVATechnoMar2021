/*
Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome
 */
package radha.CodingTest11;

public class IntegerPalindrome {
	void isNumPalindrome(int number) {
		int remainder=0, reverseNum=0;
		int originalNum= number;
		while(number!=0) {
			remainder= number%10;
			reverseNum=reverseNum*10 + remainder;
			number= number/10;
		}
		if(originalNum==reverseNum)
			System.out.println(originalNum+" : is a Palindrome.");
		else
			System.out.println(originalNum+" : is not a Palindrome.");
	}
	
	public static void main(String[] args) {
		IntegerPalindrome palindrome = new IntegerPalindrome();
		palindrome.isNumPalindrome(12323);
		System.out.println();
		palindrome.isNumPalindrome(15251);
	}
}