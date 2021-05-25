/*
 Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome
 */

package upasana.coding_exam_11;

import java.util.Scanner;

public class PalindromeNum {

	boolean isNumPalindrome(int num) {
		int numOrig = num;
		int rem = 0;
		int ans = 0;
		while (num != 0) {
			rem = num % 10;
			ans = ans * 10 + rem;
			num = num / 10;
		}
		if (numOrig == ans)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		PalindromeNum obj = new PalindromeNum();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number : ");
		int num1 = sc.nextInt();
		
		boolean flag = obj.isNumPalindrome(num1);
		if (flag)
			System.out.println("Given Number is  palindrome");
		else
			System.out.println("Given Number is not palindrome");

		System.out.println("Enter Second number : ");
		int num2 = sc.nextInt();

		boolean flag1 = obj.isNumPalindrome(num2);
		if (flag1)
			System.out.println("Given Number is  palindrome");
		else
			System.out.println("Given Number is not palindrome");
	}
}
