/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */
package ravindra_J.Coding_Exam_1;

public class Program1 {

	static int [] getIndices(int [] num, int target) {
		int firstNum = num[0]; 
		int sum=0 ;
		int index;
		for(index=1;index<num.length;index++) {
			sum = firstNum + num[index];
			if(target == firstNum + sum)
				num[1] = num[index];
			break;
		}
		return num;	

	}

	public static void main(String[] args) {

		int[]arr = {2,11,15,7,4};
		int[]output = getIndices(arr,9);
		
		for(int i=0;i<2;i++){
			System.out.println(arr[i]);
		}
	
}
	}