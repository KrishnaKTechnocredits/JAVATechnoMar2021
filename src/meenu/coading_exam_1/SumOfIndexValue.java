package meenu.coading_exam_1;

import java.util.Arrays;

/*Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
*/

public class SumOfIndexValue {
	
	int[] addition(int[] numbers,int targetNumber) {
		int outputArray[] = new int[2];
		for(int index = 0;index < numbers.length;index++) {
			 for(int innerIndex = index+1;innerIndex<numbers.length;innerIndex++) {
				 if(numbers[index] + numbers[innerIndex]== targetNumber) {
					 outputArray[0]= index;
				 	 outputArray[1]=innerIndex;
				 }	 
			 }
		}	 
		return outputArray;			 
	}
	
	public static void main(String[] args) {
		int[] numbers = {2,11,15,7,4}; 
		int targetNumber = 9;
		SumOfIndexValue sumOfIndexValue = new SumOfIndexValue();
		System.out.println("output : "+Arrays.toString(sumOfIndexValue.addition(numbers,targetNumber)));
	}

}
