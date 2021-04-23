/*Exam - 1 : 18th April 2021

Program 1 :
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]

Output: Because nums[0] + nums[3] == 9, we return [0, 3].
-------------------------------------------------------------------
*/
package kapil.Exams;

public class ReturnIndices {
	
	int[] getIndicies(int[] num, int Targetnum1){ {
		int[] output = new int[num.length];
		int outputindex = 0;
		int sum =0;
		for(int index = 0; index<num.length;index++) {
			if(num[index] < Targetnum1  && num[index]!=0 )
				outputindex = num[index];
			{
			sum = sum + outputindex;}
			
			System.out.println(sum);
				if(outputindex ==2);
					break;
		}
		return output;
		}}
	
	
	public static void main (String[] args){
		ReturnIndices returnindices = new ReturnIndices();
		int[] array = {2,11,15,7,4};
	
		returnindices.getIndicies(array, 9);
		
	}}


