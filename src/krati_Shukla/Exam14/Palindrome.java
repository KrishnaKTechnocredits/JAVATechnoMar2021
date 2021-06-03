/*1. return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]*/

package krati_Shukla.Exam14;

import java.util.ArrayList;

public class Palindrome {

	public ArrayList<Integer> getPalindrome(int[] number) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int num : number) {
			int temp = num;
			int mod = 0;
			int palin = 0;
			while (temp > 0) {
				mod = temp % 10;
				palin = palin * 10 + mod;
				temp = temp / 10;
			}
			if (palin == num) {
				output.add(palin);
				// System.out.println(output);
			}

		}

		return output;
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		int[] arr = { 323, 121, 989, 1221, 951 };
		ArrayList<Integer> answer = palindrome.getPalindrome(arr);
		System.out.println(answer);
	}

}
