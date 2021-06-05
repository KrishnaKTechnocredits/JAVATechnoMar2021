package priyanka_Panat.coding_exam_17;

/*
Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17
*/

import java.util.ArrayList;

public class MaximumSumTripletOverlap {
	String printMaximumSumTriplet(int[] input) {
		int maxSum=0;
		ArrayList<Integer> output=new ArrayList<Integer>();
		for(int index=0;index<input.length-2;index++) {
			int sum=input[index]+input[index+1]+input[index+2];
			if(maxSum<sum) {
				maxSum=sum;
				output.clear();
				output.add(input[index]);
				output.add(input[index+1]);
				output.add(input[index+2]);
			}
			
		}
		return output + " :- " + maxSum;		
	}
	public static void main(String[] args) {
		int [] arr={1,10,2,3,1,11,4,2,1};
		String result=new MaximumSumTripletOverlap().printMaximumSumTriplet(arr);
		System.out.println("Triplet having maximum sum is : " + result);
	}
}
