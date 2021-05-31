/*
Program 3 : triplet having maximum sum, index overlapping is not allowed.
input : [1,10,2,3,1,11,4,2,1,33,2] 
output : 11,4,2 -> 17 // o/p is incorrect, Correct output is 3,1,11 --> 15
 */
package ankit.coding_exam_17;

import java.util.ArrayList;

public class ArrayListReturnTripletsHavingMaxSum2 {
	
	static String getTripletsWithMaxSum(int[] input){
		int maxSum = 0;
		ArrayList<Integer> outputAL = new ArrayList<Integer>();
		for(int index = 0 ; index < (input.length - input.length % 3);index = index+3) {
			int sum = input[index]+ input[index+1]+input[index+2];
			if(sum > maxSum) {
				maxSum = sum;
				outputAL.clear();
				outputAL.add(input[index]);
				outputAL.add(input[index+1]);
				outputAL.add(input[index+2]);
			}
			
		} return ("Max Sum : "+ maxSum +" Triplets :"+outputAL);
	}
	
	public static void main(String[] args) {
		int[] input = {1,10,2,3,1,11,4,2,1,33,2};
		System.out.println(getTripletsWithMaxSum(input));
	}
}
