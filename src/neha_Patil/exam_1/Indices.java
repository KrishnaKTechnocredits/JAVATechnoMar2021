/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
Input: nums = [2,11,15,7,4], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3]. */
package neha_Patil.exam_1;

public class Indices {
	int target = 9;
	int[] returnIndices(int[] numArr) {
			int[] numArr1 = new int[2];
			for(int index=0;index<numArr.length;index++) {
				for(int index1=1;index1<numArr.length;index1++) {
					if(numArr[index] + numArr[index1] == target) {
						numArr1[0] = index;
						numArr1[1] = index1;
					}
				}
			}
			return numArr1;
		}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {2,11,15,7,4};
		Indices indices = new Indices();
		int[] result = indices.returnIndices(arr);
		//indices.returnIndices(num);
		System.out.println("Indices of numbers are:");
		System.out.println(result[0]);
		System.out.println(result[1]);
	}

}
