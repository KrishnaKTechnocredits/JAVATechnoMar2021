/*
maulik, 12:33 AM
Test - 17 :
Program 1 : return arrayList of triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1] --> 8 --> length - 2, index = index+3
output : 3,1,11 -> 15
*/

package priyanka_Panat.coding_exam_17;

import java.util.ArrayList;

public class MaximumSumTripletNonOverlap {
	String getMaximumSumNonOverlap(int[] input) {
		int maxSum=0;
		ArrayList<Integer> outputList=new ArrayList<Integer>();
		for(int index=0;index<input.length-2;index=index+3) {
			int sum=input[index]+input[index+1]+input[index+2];
			if(maxSum<sum) {
				maxSum=sum;
				outputList.clear();
				outputList.add(input[index]);
				outputList.add(input[index+1]);
				outputList.add(input[index+2]);
			}
		}
		return outputList + " :- " + maxSum;
	}
	public static void main(String[] args) {
		int[] inputArr= {1,10,2,3,1,11,4,2,1};
		String output=new MaximumSumTripletNonOverlap().getMaximumSumNonOverlap(inputArr);
		System.out.println("Triplet having maximum sum is : " + output );
	}
}
