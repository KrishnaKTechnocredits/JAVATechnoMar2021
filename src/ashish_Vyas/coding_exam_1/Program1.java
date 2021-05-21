package ashish_Vyas.coding_exam_1;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
Input: nums = [2,11,15,7,4], target = 9
Output: [0,3]
Output: Because nums[0] + nums[3] == 9, we return [0, 3].
*/

public class Program1 {

	static int[] outputResult (int[] nums, int target) {
	       for (int index1 = 0; index1 < nums.length; index1++) {
	         for (int index2 = index1 + 1; index2 < nums.length; index2++) {
	            if (nums[index1] + nums[index2] == target) {
	               return new int[] { index1, index2 };
	                }
	            }
	        }
	        return new int[] {};
	    }

	public static void main (String[] a) {
		int[] nums = {2,11,15,7,4};
		int[] arr = outputResult(nums, 9);

            System.out.println(" Because nums["+arr[0] + "] + [" + arr[1]+"] ==9, We return : ["+arr[0] + ", " + arr[1]+"]");
           
	}
}
	
