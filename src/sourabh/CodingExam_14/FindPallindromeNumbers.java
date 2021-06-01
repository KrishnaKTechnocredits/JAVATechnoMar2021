/*
26th May Coding Exam-14 : Collection

1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}
 */

package sourabh.CodingExam_14;

import java.util.ArrayList;
import java.util.Arrays;

public class FindPallindromeNumbers {
	boolean isPallindromeNumber(int number) {
		int rem = 0;
		int ans = 0;
		int temp = number;
		while (number > 0) {
			rem = number % 10;
			number = number / 10;
			ans = ans * 10 + rem;
		}
		if (ans == temp)
			return true;
		else
			return false;
	}

	public ArrayList<Integer> getPalindrome(int[] numberList) {
		ArrayList<Integer> outputNumberList = new ArrayList<Integer>();
		for (int index = 0; index < numberList.length; index++) {
			if (isPallindromeNumber(numberList[index]) == true)
				outputNumberList.add(numberList[index]);

		}
		return outputNumberList;
	}

	public static void main(String[] args) {
		int inputArr[] = { 123, 121, 989, 1221, 951 };
		FindPallindromeNumbers findPallindromeNumbers = new FindPallindromeNumbers();
		ArrayList<Integer> output = findPallindromeNumbers.getPalindrome(inputArr);
		System.out.println(output);
	}
}
