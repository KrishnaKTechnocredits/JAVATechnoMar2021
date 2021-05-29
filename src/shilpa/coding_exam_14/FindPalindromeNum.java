/*Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]
*/
package shilpa.coding_exam_14;

import java.util.ArrayList;

public class FindPalindromeNum {
	public boolean getPalindrome(int num) {
		int temp = 0;
		int sum = 0;
		int num1 = num;
		while (num > 0) {
			temp = num % 10;
			sum = (sum * 10) + temp;
			num = num / 10;
		}
		return num1 == sum ? true : false;
	}

	public ArrayList<Integer> getPalindromefromArr(int[] numbers) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int num : numbers) {
			if (getPalindrome(num) == true) {
				outputList.add(num);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		FindPalindromeNum findPalindromeNum = new FindPalindromeNum();
		int[] input = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> output = findPalindromeNum.getPalindromefromArr(input);
		System.out.println("Palindrome Numbers Fron Given Array are");
		System.out.println(output);
	}

}
