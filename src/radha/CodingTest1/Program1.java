/*
 Coding Exam - 1 : 18th April 2021

Program 1 : 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
 */

package radha.CodingTest1;

public class Program1 {
	
	int[] returnIndices(int[] numArr, int targetNum) {
		int[] output = new int [2];
		int outputIndex=0; 
		for(int index=numArr.length-1; index >= 0;index--) {
			for(int innerIndex=0; innerIndex < numArr.length;innerIndex++) {
				int temp = numArr[index]+numArr[innerIndex];
				if(temp==targetNum) {
					output[outputIndex] = innerIndex;
					outputIndex++;
				}
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Program1 program1 = new Program1();
		int[] num = {2,11,15,7,4};
		int [] outputArr = program1.returnIndices(num, 9);
		System.out.println("We return");
		for(int i = 0; i < outputArr.length;i++) {
			System.out.println(outputArr[i]);
		}
	}
}
/*
Output:

We return
0
3
*/