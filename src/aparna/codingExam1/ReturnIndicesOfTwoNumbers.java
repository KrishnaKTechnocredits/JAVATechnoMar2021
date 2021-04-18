/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */
package aparna.codingExam1;

public class ReturnIndicesOfTwoNumbers {

	public int[] returnIndicesofTWoNum(int[] inputNumber, int targetNumber) {

		int[] outputArr = new int[inputNumber.length];

		for (int outerIndex = 0; outerIndex < inputNumber.length; outerIndex++) {

			for (int innerIndex = 1; innerIndex < inputNumber.length; innerIndex++) {

				int[] result = new int[] { outerIndex, innerIndex };
				if (inputNumber[outerIndex] + inputNumber[innerIndex] == targetNumber) {
					return result;
				}

			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		int[] givenNumbers = new int[] { 2, 11, 15, 7, 4 };
		int targetNumber = 9;
		int[] answer = new ReturnIndicesOfTwoNumbers().returnIndicesofTWoNum(givenNumbers, targetNumber);
		for (int index = 0; index < answer.length; index++) {
			System.out.println(answer[index]);
		}

	}

}
