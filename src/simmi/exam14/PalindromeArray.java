/*26th May Coding Exam-14 : Collection

1. return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
	//write your logic
}*/

package simmi.exam14;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeArray {
	public ArrayList<Integer> getPalindrome(Integer[] number) {
		
		ArrayList<Integer> outputList = new ArrayList<Integer>(Arrays.asList(number));
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for (int index = 0; index < outputList.size(); index++) {
			int sum = 0;
			int num = 0;
			int temp = outputList.get(index);
			int num1 = outputList.get(index);
			while (num1 != 0) {
				num = num1 % 10;
				num1 = num1 / 10;
				sum = (sum * 10) + num;
			}
			if (temp == sum) {
				output.add(temp);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Integer[] input = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> output = new PalindromeArray().getPalindrome(input);
		System.out.println(output);
	}
}
