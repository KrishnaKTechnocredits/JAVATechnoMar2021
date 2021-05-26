/*
 1. return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}
 */
package ravindra_J.coding_exam_14_Coll_ArrayList_PalindromNum_UniqueNum;

import java.util.ArrayList;

public class PalindromArray {
	public ArrayList<Integer> getPalindrome(int number[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < number.length; index++) {
			int num = number[index];
			int temp = num;
			int sum = 0;
			while (temp != 0) {
				int reminder = temp % 10;
				sum = (sum * 10) + reminder;
				temp = temp / 10;
			}
			if (sum == num) {
				output.add(sum);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		PalindromArray palindromarray = new PalindromArray();
		int[] input = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> answer = palindromarray.getPalindrome(input);
		System.out.println("Output: " + answer);
	}

}
