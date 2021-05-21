package meenu.coding_exam_11;

import java.util.Scanner;

/*Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome
*/

public class PalindromeNum {
	
	void getPalindromeNum(int number) {
		int r = 0;
		int outputNum = 0;
		int temp = number;
		while(temp>0) {
			r = temp%10;
			outputNum = (outputNum*10)+r;
			temp = temp/10;
		}
		
		if(outputNum == number)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}

	public static void main(String[] args) {
		PalindromeNum palindromeNum = new PalindromeNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number you want to check");
		int num1 = sc.nextInt();
		palindromeNum.getPalindromeNum(num1);
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter the 2nd number you want to check");
		int num2 = sc.nextInt();
		palindromeNum.getPalindromeNum(num2);
	}

}
