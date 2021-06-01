/*1. return all the palindrome number from given array.
input: [123,121,989,1221,951]
output: [121,989,1221]
public ArrayList<Integer> getPalindrome(int numbser[]){
*/
package krati_Jain.codingExam14;

import java.util.ArrayList;

public class PalindromeInArrayList {

	public static void main(String[] args) {

		int[] intArr = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for (int index = 0; index < intArr.length; index++)
			numList.add(intArr[index]);
		System.out.println("Input list of numbers is : " + numList);

		PalindromeInArrayList palindromeInArrayList = new PalindromeInArrayList();

		System.out.println(
				"Palindrome numbers in the list provided are : " + palindromeInArrayList.getPalindrome(numList));
	}

	ArrayList<Integer> getPalindrome(ArrayList<Integer> numList) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		for (int tempNum : numList) {
			int sum = 0;
			int processingNum = tempNum; // 123
			int reverseNum = 0;
			while (processingNum > 0) {
				int singleNum = processingNum % 10; // 3//2//1
				sum = (sum * 10) + singleNum; // 30 , 320
				processingNum = processingNum / 10; // 12//1
			}
			if (tempNum == sum)
				outputList.add(tempNum);
		}
		return outputList;

	}

}
