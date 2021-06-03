/*
	26th May Coding Exam-14 : Collection

	1. Return all the palindrome number from given array.
	input: [123,121,989,1221,951]
	output: [121,989,1221]

	public ArrayList<Integer> getPalindrome(int numbser[]){
		//write your logic
	}
 */
package paras.Coding_exam_14;

import java.util.ArrayList;

public class ReturnPalindromeNumber {

	ArrayList<Integer> getPalindrome(int[] number) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < number.length; index++) {
			int num = number[index]; // 123
			int answer = 0;
			int temp = num;
			int mod = 0;
			while (temp > 0) {
				mod = temp % 10;
				temp = temp / 10;
				answer = answer * 10 + mod;
			}
			if (num == answer) {
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnPalindromeNumber returnPalindromeNumber = new ReturnPalindromeNumber();
		int[] input = { 123, 121, 989, 1221, 951 };
		// ArrayList<Integer> output = returnPalindromeNumber.getPalindrome(input);
		System.out.println(returnPalindromeNumber.getPalindrome(input));

	}
}
