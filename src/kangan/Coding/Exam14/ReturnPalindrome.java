package kangan.Coding.Exam14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]*/

public class ReturnPalindrome {

	public ArrayList<Integer> getPalindrome(List<Integer> input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < input.size(); index++) {
			int temp = input.get(index);
			int revNum = 0;
			while (temp > 0) {
				revNum = revNum * 10 + temp % 10;
				temp = temp / 10;
			}
			if (revNum == input.get(index)) {
				output.add(revNum);
			}
		}
		return output;

	}

	public static void main(String[] args) {
		ReturnPalindrome returnPalindrome = new ReturnPalindrome();
		// int[] input = { 123, 121, 989, 1221, 951 };
		// can write int[] as array of int which is primitive data type Hence we need to
		// convert int into Integer
		Integer[] input = { 123, 121, 989, 1221, 951 };
		List<Integer> numberList = Arrays.asList(input);
		ArrayList<Integer> output = returnPalindrome.getPalindrome(numberList);
		System.out.println(output);
	}
}
