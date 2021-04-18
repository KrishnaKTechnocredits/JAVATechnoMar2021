/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
Input: nums = [2,11,15,7,4], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

package krati_Jain.arrayCodingExam1;

public class ArrayCodingExam1 {

	public static void main(String[] args) {
		ArrayCodingExam1 arrayCodingExam1 = new ArrayCodingExam1();
		arrayCodingExam1.setData();

	}

	void setData() {

		int[] nums = { 2, 11, 15, 7, 4 };
		int target = 9;
		int[] newArr = validatingArray(target, nums);
		System.out.println("Output: ");
		for (int index = 0; index < newArr.length; index++) {
			System.out.println(newArr[index]);
		}

	}

	int[] validatingArray(int target, int[] nums) {
		int sum = 0;
		int index = 0;
		int innerIndex = 0;
		int[] tempArr = new int[2];
		for (index = 0; index < nums.length; index++) {
			for (innerIndex = 0; innerIndex < nums.length; innerIndex++) {
				sum = nums[index] + nums[innerIndex];
				if (sum == 9) {
					tempArr[0] = index;
					tempArr[1] = innerIndex;

				}

			}
			break;
		}

		// System.out.println("My selected arrays :" + tempArr[0] + tempArr[1]);
		return tempArr;
	}

}
