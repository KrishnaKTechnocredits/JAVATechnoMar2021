/*
 Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */

package paras.Coding_exam_1;

public class ReturnIndices {
	
	int[] indicesReturn(int [] number, int target) {
		int [] output = new int[2];
		for(int index= 0; index < number.length ; index++) {
			for(int innerindex = 1; innerindex < number.length ; innerindex ++) {
				if (number[index] + number[innerindex] == target) {
					output[0] = index;
					output[1] = innerindex;
				}
			}
			
		}	
		return output;	

	}	
	
	public static void main(String[] args) {
		int [] arr = {2,11,15,7,4};
		ReturnIndices returnIndices = new ReturnIndices();
		int[] output = returnIndices.indicesReturn(arr, 9);
		System.out.println(output[0]);
		System.out.println(output[1]);
	}
}
