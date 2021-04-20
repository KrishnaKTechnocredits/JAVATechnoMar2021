/*
 * Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */

package ankit.coding_exam_1;

public class SumToTargetIndex {
	 void checkSumtotarget(int[] numList, int targetNum) {
		 for (int index = 0; index < numList.length; index++) {
			 int firstNum = numList[index];
			 	for(int innerIndex = 1; innerIndex <numList.length; innerIndex++) {
			 		if(firstNum + numList[innerIndex] == 9)
			 			System.out.println(index+ " and " +innerIndex);
			 	}		 	
		 }			 	 
	 }

	public static void main(String[] args) {
		SumToTargetIndex sumToTargetIndex = new SumToTargetIndex();
		int[] numList = {2,7,7,2,4};
		int targetNum = 9;
		sumToTargetIndex.checkSumtotarget(numList, targetNum);	
	}
}
