/*Coding Exam - 1 : 18th April 2021

Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers
such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

package vaibhav.CoadingExam1;

public class IndexNum {

	int index;
	int innerIndex;
	int sum;

	int[] getArr(int[] numArr, int targetNum) {

		int[] targetArr = new int[2];
		for (index = 0; index < numArr.length; index++) {
			for (innerIndex = 0; innerIndex < numArr.length; innerIndex++) {
				sum = numArr[index] + numArr[innerIndex];
				if (sum == targetNum) {
					targetArr[0] = index;
					targetArr[1] = innerIndex;
					break;
				}
			}

		}
		return targetArr;
	}

	public static void main(String[] args) {
		int[] numArr = { 2, 11, 15, 7, 4 };
		int targetNum = 9;
		int[] targetArr = new int[2];

		IndexNum indexNum = new IndexNum();
		targetArr = indexNum.getArr(numArr, targetNum);

		for (int index = 0; index < targetArr.length; index++) {
			System.out.println(targetArr[index]);

		}

	}

}
