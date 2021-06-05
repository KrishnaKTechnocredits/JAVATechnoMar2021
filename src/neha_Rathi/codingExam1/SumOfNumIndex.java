//Program 1 :
//Given an array of integers nums and an integer target, 
//return indices of the two numbers such that they add up to the target.
//Input: nums = [2,11,15,7,4], target = 9
//Output: [0,3]
//Output: Because nums[0] + nums[3] == 9, we return [0, 3].

package neha_Rathi.codingExam1;

public class SumOfNumIndex {
	
	int[] calculateIndex(int[] nums, int targetNum) {
		int[] output = new int[2];
		for (int index = 0; index < nums.length; index++) {
			for (int innerIndex = 0; innerIndex < nums.length; innerIndex++)
				if (nums[index] + nums[innerIndex] == targetNum) {
					int count = 0;
					output[count] = innerIndex;
					count++;
					output[count] = index;
				}
		}
		return output;
	}

	public static void main(String[] args) {
		SumOfNumIndex sumOfNumIndex = new SumOfNumIndex();
		int[] nums = { 2, 11, 15, 7, 4 };
		int targetNum = 9;
		int[] output = (sumOfNumIndex.calculateIndex(nums, targetNum));
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index]);
		}
	}
}
