package pallavi.coding_exam_14;

import java.util.ArrayList;

/*1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]*/

public class Palindrome {

	public ArrayList<Integer> getPalindrome(int numbser[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int num : numbser) {
			int sum = 0; int actualNum=num;
		while (num > 0) {
			int rem = 0;
			rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}

		if (actualNum == sum)
			output.add(sum);
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> output = new Palindrome().getPalindrome(input);
		System.out.println(output);

	}

}
