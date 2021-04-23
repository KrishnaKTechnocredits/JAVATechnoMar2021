package madhavi_Raut.CodingExam.CodingExam_01;

/*Program 1 :
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to the target.
Input: nums = [2,11,15,7,4], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

public class FindIndices {

	static int[] arrIndex = new int[2];

	int[] getIndices(int[] nums, int numTarget) {
		boolean flag = false;
		for (int index = 0; index < nums.length; index++) {
			for (int innerIndex = index + 1; innerIndex < nums.length; innerIndex++) {
				if ((nums[index] + nums[innerIndex]) == numTarget) {
					arrIndex[0] = index;
					arrIndex[1] = innerIndex;
					flag = true;
					break;
				}
			}
			if (flag)
				break;
		}
		return arrIndex;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 11, 15, 7, 4 };
		int numTarget = 9;
		new FindIndices().getIndices(nums, numTarget);
		System.out.println("Below are the indices of the two numbers which add upto Target num " + numTarget);
		for (int index = 0; index < arrIndex.length; index++) {
			System.out.print(arrIndex[index] + " ");
		}
	}
}
