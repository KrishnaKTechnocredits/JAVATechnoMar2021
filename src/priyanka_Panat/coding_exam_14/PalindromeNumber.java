/*
26th May Coding Exam-14 : Collection

1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}
 */
package priyanka_Panat.coding_exam_14;

import java.util.ArrayList;

public class PalindromeNumber {
	boolean checkPalindomeNum(int num) {
		int rem = 0;
		int temp = num;
		while (num != 0) {
			int digit = num % 10;
			rem = rem * 10 + digit;
			num = num / 10;
		}
		if (rem == temp) {
			return true;
		}
		return false;
	}

	public ArrayList<Integer> getPalindrome(int[] number) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int temp:number) {
			boolean isNumPalindrome = checkPalindomeNum(temp);
			if (isNumPalindrome) {
				output.add(temp);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		int[] arr = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> res = palindromeNumber.getPalindrome(arr);
		System.out.println(res);
	}
}

