/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

package sangeeta.CodingExam;

public class CodingExam1_1 {

	int[] getIndicesOfNum(int[] nums, int targetNum) {
		int[] output = new int[2];
		int outputindex = 0;
		for (int index = 0; index < nums.length; index++) {
			for (int innerindex = 1; innerindex < nums.length; innerindex++)
				if (nums[index] + nums[innerindex] == targetNum) {
					output[outputindex] = index;
					output[outputindex + 1] = innerindex;
				}
		}
		for (int i = 0; i < output.length; i++)
			System.out.println("Indices are " + output[i]);
		return output;

	}

	public static void main(String[] a) {
		CodingExam1_1 codingExam1_1 = new CodingExam1_1();
		int[] nums = { 2, 11, 15, 7, 4 };
		int targetnum = 9;
		codingExam1_1.getIndicesOfNum(nums, targetnum);
	}
}
