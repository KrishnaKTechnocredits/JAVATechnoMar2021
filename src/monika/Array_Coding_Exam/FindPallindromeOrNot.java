package monika.Array_Coding_Exam;

import java.util.Scanner;

/*Programming Test - 11 : 21st May'2021

Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome*/
public class FindPallindromeOrNot {

	void isPallindrome(int input) {
		String s = String.valueOf(input);
		StringBuffer sb = new StringBuffer(s);
		int output = Integer.parseInt(sb.reverse().toString());
		if (input == output)
			System.out.println("Pallindrome");
		else
			System.out.println("Not Pallindrome");
	}

	void Pallindrome(int num) {
		int sum = 0;
		int temp = num;
		while (temp > 0) {
			int mod = temp % 10;
			sum = (sum * 10) + mod;
			temp = temp / 10;

		}
		if (sum == num)
			System.out.println(num + " Number is Palindrome");
		else
			System.out.println(num + " Number is not Palindrome");
	}//checked from Internet

	public static void main(String[] args) {
		FindPallindromeOrNot obj = new FindPallindromeOrNot();
		obj.isPallindrome(15251);
		obj.isPallindrome(12323);

		obj.Pallindrome(15251);
		obj.Pallindrome(12323);

	}

}
