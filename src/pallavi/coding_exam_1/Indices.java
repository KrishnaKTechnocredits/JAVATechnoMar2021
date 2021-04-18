package pallavi.coding_exam_1;

/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

public class Indices {

	int[] returnIndices(int num[], int target) {
		int[] output = new int[2];
		// int outputIndex;
		for (int index = 0; index < num.length; index++) {
			for (int index1 = index + 1; index1 < num.length; index1++) {
				if (num[index] + num[index1] == target) {
					output[0] = index;
					output[1] = index1;
				}

			}

		}
		return output;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 11, 15, 7, 4 };
		int target = 9;
		int[] finalOutput = new Indices().returnIndices(nums, target);
		for (int index = 0; index < finalOutput.length; index++) {
			System.out.println(finalOutput[index]);
		}
	}

}
