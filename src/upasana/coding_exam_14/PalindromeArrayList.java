/*
26th May Coding Exam-14 : Collection

1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
//write your logic
}
 */

package upasana.coding_exam_14;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeArrayList {

	public ArrayList<Integer> getPalindrome(Integer[] input) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(input));

		for (int index = 0; index < inputList.size(); index++) {

			int ans = 0;
			int rem = 0;
			int num = inputList.get(index);
			int revNum = inputList.get(index);
			while (num != 0) {

				rem = num % 10;
				ans = (ans * 10) + rem;
				num = num / 10;
			}
			if (revNum == ans) {
				outputList.add(revNum);
			}

		}
		return outputList;
	}

	public static void main(String[] args) {
		Integer[] input = { 123, 121, 989, 1221, 951 };

		ArrayList<Integer> outputList = new PalindromeArrayList().getPalindrome(input);
		System.out.println(outputList);
	}

}
