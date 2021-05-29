/*
 1. return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}

 */

package ami.Coding_Exam_14;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeNum {

	int remainder = 0;
	int palindrom = 0;

	public ArrayList<Integer> getPalindrome(int[] number) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int num : number) {
			int remainder = 0;
			int palindrom = 0;
			int temp = num;
			while (temp > 0) {
				remainder = temp % 10;
				palindrom = (palindrom * 10) + remainder;
				temp = temp / 10;
			}
			if (num == palindrom) {
				list.add(num);
			}
		}
		return list;
	}

	public static void main(String[] a) {
		PalindromeNum palindromeNum = new PalindromeNum();
		int[] input = { 123, 121, 989, 1221, 951 };
		System.out.println("output :" + palindromeNum.getPalindrome(input));
	}
}
