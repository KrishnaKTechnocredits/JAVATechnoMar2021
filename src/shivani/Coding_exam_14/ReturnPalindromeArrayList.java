package shivani.Coding_exam_14;

import java.util.ArrayList;

/*1. return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]*/

public class ReturnPalindromeArrayList {
	
	
	public ArrayList<Integer> getPalindrome(int number[]) {
		
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < number.length; i++) {
			int remainder=0, sum = 0;
			int temp = number[i];
			while (number[i] > 0) {
				remainder = number[i] % 10;
				sum = (sum * 10) + remainder;
				number[i] = number[i] / 10;
			}

			if (temp==sum) {
				
				output.add(temp);
			}
		}

		return output;

	}

	public static void main(String[] args) {
		int input[] = { 123, 121, 989, 1221, 951 };
		ReturnPalindromeArrayList returnPalindromeArrayList = new ReturnPalindromeArrayList();
		// returnPalindromeArrayList.getPalindrome(input);
		ArrayList<Integer> output = new ArrayList<Integer>();
		output = returnPalindromeArrayList.getPalindrome(input);
		System.out.println("Output" + output.toString());

	}
}
