package monika.Practise1.Revision2;

import java.util.Arrays;

/*Program 1 :
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to the target.
Input: nums = [2,11,15,7,4], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3]*/
public class ReturnIndicesOfNumEqualsTarget {

	private int[] getIndexesForTarget(int[] arr, int target) {
		int[] output = new int[2];
		for(int index=0;index<arr.length;index++) {
			for(int innerindex=index+1;innerindex<arr.length;innerindex++) {
				if(arr[index] + arr[innerindex] == target) {
					output[0] = index;
					output[1] = innerindex;
					
					break;
				}
			}System.out.println(output[0]+" "+output[1]);
			//if()
		}
		
		
		return output;
	}
	
	public static void main(String[] args) {
		ReturnIndicesOfNumEqualsTarget obj = new ReturnIndicesOfNumEqualsTarget();
		int[] arr = {2,4,11,15,7,4};
		int [] result = obj.getIndexesForTarget(arr, 19);
		System.out.println(Arrays.toString(result));
	}

}
