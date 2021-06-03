/*Coding Exam - 14 : 26th May'2021 Collection

1. Return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]

public ArrayList<Integer> getPalindrome(int numbser[]){
//write your logic
}

*/

package vaibhav.CoadingExam14;

import java.util.ArrayList;

public class PalindromeNum {

	public ArrayList<Integer> getPalindrome(int number[]) {
		ArrayList<Integer> outputArrList = new ArrayList<Integer>();

		for (int index = 0; index < number.length; index++) {
			int num = number[index];
			int sum = 0;
			int temp = 0;

			while (num != 0) { // 123 //12 //1
				temp = num % 10; // 3 // 2 //1
				sum = sum * 10 + temp; // 3 //32 //321
				num = num / 10; // 12 // 1 //0
			}

			if (sum == number[index])
				outputArrList.add(number[index]);
		}

		return outputArrList;
	}

	public static void main(String[] args) {

		PalindromeNum palindromeNum = new PalindromeNum();

		int[] inputArr = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> outputArrList = new ArrayList<Integer>();

		outputArrList = palindromeNum.getPalindrome(inputArr);

		System.out.println("ArrayList with palindrome number is : " + outputArrList);

	}

}
