package bhavana_coding_exam_1;
/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up 
to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3]*/

public class ReturnIndices {

	int nums[]= {1,2,5,8,10};
	int target=9;
	int output[]=new int[2];
	int outputIndex;
	
	int[] indicesReturn() {
	for(int index=0;index<nums.length;index++) {
		for(int innerIndex=index+1;innerIndex<nums.length;innerIndex++) {
			if(nums[index]+nums[innerIndex]==target) {
				output[0]=index;
				output[1]=innerIndex;
			}	
		}
	}
	
	return output;
}
	public static void main(String[] args) {
		ReturnIndices rt=new ReturnIndices();
		int show[]=new int[2];
		show=rt.indicesReturn();
		
		for(int index=0;index<show.length;index++) {
			System.out.println(show[index]);
	}
}		
}
