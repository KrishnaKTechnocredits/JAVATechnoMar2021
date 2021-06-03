/*1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]
*/
package kajal.Codingexam;

import java.util.ArrayList;

public class ReturnArrayListPalindrom {

	ArrayList<Integer> getPalindrom(ArrayList<Integer> input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < input.size(); index++) {
			int num = input.get(index);
			int ans = 0;
			while (num > 0) {
				int Reminder = num % 10;
				num = num / 10;
				ans = ans * 10 + Reminder;
			}
			if (ans == input.get(index))
				output.add(input.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnArrayListPalindrom codingExam14_P1 = new ReturnArrayListPalindrom();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(123);
		nums.add(121);
		nums.add(989);
		nums.add(1221);
		nums.add(951);
		ArrayList<Integer> output = codingExam14_P1.getPalindrom(nums);
		System.out.println("Arraylist of palindrom numbers are: " + output);
	}
}
