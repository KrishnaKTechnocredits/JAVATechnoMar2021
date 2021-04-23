/*
Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers
 such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */
package upasana.coding_exam_1;

public class ArrayInt {
	
	int[] output=new int[2];
	int[] arrIndices(int[] num,int target){
		int sum=0;
		for(int index=0;index<num.length;index++) {
			for(int innerIndex=index+1;innerIndex<num.length;innerIndex++) {
				sum=num[index]+num[innerIndex];
				if(sum==target) {
					output[0]=index;
					output[1]=innerIndex;
				}
			}
		}
		return output;
	}
	public static void main(String[] args) {
		ArrayInt arrayInt=new ArrayInt();
		int[] num=new int[] {2,11,15,7,4};
		int target=9;
		int[] output=arrayInt.arrIndices(num,target);
		for(int index=0;index<output.length;index++)
			System.out.println(output[index]);
	}
}
