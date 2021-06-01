/* Coding Exam - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome

*/


package vaibhav.CodingExam11;

public class PalindromeNum {
	
	
	void isNumPalindrome (int num) {	//12321
	
		int originalNum = num;
		int reminder = 0;
		int ans=0;
			
		while(num!= 0) {	//	123
			
			reminder = num%10;			//	3			//	2			//	1
			ans = ans*10 + reminder;	//	0 + 3 = 3	//	30+2 = 32	//	320 + 1 = 321
			num = num/10;				//	12			//	1			//	0
		}
		
		if (originalNum == ans)
			System.out.println( originalNum + "  : number is palindrome");
		else 
			System.out.println( originalNum + "  : number is not palindrome");
	}
		
	
	public static void main(String[] args) {
		
		PalindromeNum palindromeNum = new PalindromeNum();
		int num1 = 12323;
		int num2 = 15251;
		palindromeNum.isNumPalindrome(num1);
		palindromeNum.isNumPalindrome(num2);
	}

	

}
