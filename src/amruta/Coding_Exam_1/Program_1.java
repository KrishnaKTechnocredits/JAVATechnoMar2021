/*
 * Given an array of integers nums and an integer target, 
 * return indexes of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */


package amruta.Coding_Exam_1;

public class Program_1 {

	int target=9;

	void getindex(int[] arr){
		for(int i=0; i < arr.length; i++) {
			for (int j=1; j< arr.length; j++){
				if(arr[i]+ arr[j] ==  target) {
					System.out.println("Indexes of Numbers :"+i+","+j);
				}
			}
		}	
	}
	
	public static void main(String[] args) {
		int[] arraynum = {11,2,15,7,4};
		new Program_1().getindex(arraynum);
	}
	
}
