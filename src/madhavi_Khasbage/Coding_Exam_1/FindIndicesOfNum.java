package madhavi_Khasbage.Coding_Exam_1;

import java.lang.reflect.Array;

/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
Input: nums = [2,11,15,7,4], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].*/

public class FindIndicesOfNum {
	
	/* Find indices of numbers whose sum eual to target number */
	int[] getIndices(int[] arrNum, int target) {
		int[] arrIndices = { -1, -1 };
		for (int index = 0; index < arrNum.length; index++) {
			for (int index1 = 0; index1 < arrNum.length; index1++) {
				if (arrNum[index] + arrNum[index1] == target) {
					if (index > index1) {
						arrIndices[0] = index1;
						arrIndices[1] = index;
					} else {
						arrIndices[0] = index;
						arrIndices[1] = index1;
					}
					break;
				}
			}
			if (arrIndices[0] > 0) {
				break;
			}
		}
		return arrIndices;
	}

	public static void main(String[] args) {
		FindIndicesOfNum findIndices = new FindIndicesOfNum();
		int[] arrNum = { 2,11, 15, 7, 4 };
		int targetInt = 9;
		int[] arr = findIndices.getIndices(arrNum, targetInt);
		System.out.println("[" + arr[0] + " " + arr[1] + "]");
	}

}
