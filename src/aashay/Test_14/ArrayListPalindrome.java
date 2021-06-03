package aashay.Test_14;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}
 */
public class ArrayListPalindrome {

	public ArrayList<Integer> getPalindrome(int numbers[]) {
		ArrayList<Integer> input = new ArrayList<Integer>();

		for (int index = 0; index < numbers.length; index++) {
			int indexNum = numbers[index];
			int reverseNum = 0;
			while (indexNum > 0) {
				int remainder = indexNum % 10;
				indexNum = indexNum / 10;
				reverseNum = reverseNum * 10 + remainder;
			}
			if (reverseNum == numbers[index]) {
				input.add(numbers[index]);
			}
		}
		return input;
	}

	public static void main(String[] args) {
		ArrayListPalindrome arrayListPalindrome = new ArrayListPalindrome();
		int[] input = new int[] { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> output = arrayListPalindrome.getPalindrome(input);
		System.out.println("Palindrome numbers are" + output.toString());

	}

}
