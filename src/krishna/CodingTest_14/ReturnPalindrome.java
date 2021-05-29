package krishna.CodingTest_14;

import java.util.ArrayList;

/*1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]
public ArrayList<Integer> getPalindrome(int numbers[]){
        //write your logic
}*/
public class ReturnPalindrome {

	static int[] arr = { 121, 989, 1221, 951, 9999 };

	public ArrayList<Integer> getPalindromeNums(int numbers[]) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();

		for (int num : numbers) {
			int temp = num;
			int reminder = 0;
			int palindromeNum = 0;
			while (temp > 0) {
				reminder = temp % 10;
				palindromeNum = palindromeNum * 10 + reminder;
				temp = temp / 10;
			}
			if (palindromeNum == num) {
				newArr.add(palindromeNum);
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		ReturnPalindrome returnPalindrome = new ReturnPalindrome();
		ArrayList<Integer> output = returnPalindrome.getPalindromeNums(arr);
		System.out.println("The palindrome number from given array: " + output);
	}
}
