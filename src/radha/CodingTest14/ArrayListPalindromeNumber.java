/*
26th May Coding Exam-14 : Collection

1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}
 */
package radha.CodingTest14;

import java.util.ArrayList;

public class ArrayListPalindromeNumber {

	public ArrayList<Integer> getPalindrome(int numbers[]) {
		ArrayList<Integer> palindromeNum = new ArrayList<Integer>();
		for (int index = 0; index < numbers.length; index++) {
			int rem = 0, reverseNum = 0;
			int number = numbers[index];
			while (number != 0) {
				rem = number % 10;
				number = number / 10;
				reverseNum = reverseNum * 10 + rem;
			}
			if (reverseNum == numbers[index]) {
				palindromeNum.add(numbers[index]);
			}
		}
		return palindromeNum;
	}

	public static void main(String[] args) {
		ArrayListPalindromeNumber palindrome = new ArrayListPalindromeNumber();
		int[] numArray = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> outputArr = palindrome.getPalindrome(numArray);
		System.out.println("Palindrome numbers in the given string : " + outputArr);
	}
}