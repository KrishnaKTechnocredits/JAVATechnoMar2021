/*
1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}
*/

package sandesh.coding_exam_14;

import java.util.ArrayList;

public class PalindromeNumbers {

	public ArrayList<Integer> getPalindrome(int numbers[]) {
		ArrayList<Integer> outAL = new ArrayList<Integer>();
		for (int index = 0; index < numbers.length; index++) {
			int tempNum = numbers[index];
			int revNum = 0;
			while (tempNum > 0) {
				revNum = revNum * 10 + tempNum % 10;
				tempNum = tempNum / 10;
			}
			if (revNum == numbers[index]) {
				Integer refInt = new Integer(numbers[index]);
				outAL.add(refInt);
			}
		}
		return outAL;
	}

	public static void main(String[] args) {
		int[] input = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> outputAL = new ArrayList<Integer>();
		outputAL = new PalindromeNumbers().getPalindrome(input);
		System.out.println("Palindrom numbers from given Array are -: ");
		System.out.println(outputAL);
	}
}
