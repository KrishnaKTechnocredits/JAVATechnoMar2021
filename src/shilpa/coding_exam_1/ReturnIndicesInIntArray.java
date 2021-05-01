/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
*/
package shilpa.coding_exam_1;

public class ReturnIndicesInIntArray {
	int[] getIndicesOfArray(int[] num, int target) {
		int[] output = new int[2];
		for (int index1 = 0; index1 < num.length; index1++) {

			for (int index2 = 0; index2 < num.length; index2++) {
				if (index1 != index2) {
					if (num[index1] + num[index2] == target) {
						output[0] = index1;
						output[1] = index2;
					}
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnIndicesInIntArray returnIndicesInIntArray = new ReturnIndicesInIntArray();
		int[] nums = { 2, 11, 15, 7, 4 };

		int[] arrReturn = returnIndicesInIntArray.getIndicesOfArray(nums, 9);
		for (int index = 0; index < arrReturn.length; index++)
			System.out.println(arrReturn[index]);
	}

}
